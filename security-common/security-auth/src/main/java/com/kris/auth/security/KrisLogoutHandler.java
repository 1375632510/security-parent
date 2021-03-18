package com.kris.auth.security;

import com.kris.base.constant.KrisConstant;
import com.kris.base.domain.R;
import com.kris.base.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Component
@RequiredArgsConstructor
public class KrisLogoutHandler implements LogoutHandler {

    private final TokenHandler tokenHandler;

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
        String authorization = httpServletRequest.getHeader(KrisConstant.HEADER_AUTHORIZATION);
        if (authorization != null && authorization.contains(KrisConstant.TOKEN_BEARER)) {
            String token = authorization.replaceAll(KrisConstant.TOKEN_BEARER, "");
            String username = tokenHandler.removeToken(token);
            redisTemplate.delete(username);
        }
        ResponseUtil.out(httpServletResponse, R.success(""));
    }
}
