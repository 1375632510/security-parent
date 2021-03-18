package com.kris.auth.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kris.auth.domain.SecurityUser;
import com.kris.auth.domain.User;
import com.kris.auth.security.TokenHandler;
import com.kris.base.constant.KrisConstant;
import com.kris.base.domain.R;
import com.kris.base.exception.KrisException;
import com.kris.base.exception.KrisEnum;
import com.kris.base.util.ResponseUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
public class KrisLoginFilter extends UsernamePasswordAuthenticationFilter {

    private final TokenHandler tokenHandler;
    private final RedisTemplate<String, Object> redisTemplate;
    private final AuthenticationManager authenticationManager;

    public KrisLoginFilter(TokenHandler tokenHandler,
                           RedisTemplate<String, Object> redisTemplate,
                           AuthenticationManager authenticationManager) {
        this.tokenHandler = tokenHandler;
        this.redisTemplate = redisTemplate;
        this.authenticationManager = authenticationManager;
        this.setPostOnly(false);
        this.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher("/admin/acl/login", "POST"));
    }


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            User user = new ObjectMapper().readValue(request.getInputStream(), User.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword(),
                            new ArrayList<>()));
        } catch (IOException e) {
            e.printStackTrace();
            throw new KrisException(KrisEnum.IO_EXCEPTION);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        SecurityUser user = (SecurityUser) authResult.getPrincipal();
        String token = tokenHandler.createToken(user.getUsername());
        redisTemplate.opsForValue().set(user.getUsername(), user.getPermissionValueList());
        Map<String, Object> map = new HashMap<>(16);
        map.put(KrisConstant.HEADER_AUTHORIZATION, KrisConstant.TOKEN_BEARER + token);
        ResponseUtil.out(response, R.success("", map));
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        ResponseUtil.out(response, R.error(""));
    }
}
