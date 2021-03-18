package com.kris.auth.security;

import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Component
@RequiredArgsConstructor
public class TokenHandler {

    private final TokenProperties tokenProperties;

    /**
     * 可从配置文件获取
     */
    private final long TOKEN_TIME = tokenProperties.getTime();

    /**
     * 可从配置获取
     */
    private final String tokenSignKey = tokenProperties.getSignKey();

    public String createToken(String username) {
        return Jwts.builder().setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + TOKEN_TIME))
                .signWith(SignatureAlgorithm.HS512, tokenSignKey)
                .compressWith(CompressionCodecs.GZIP).compact();
    }

    public String getInfo(String token) {
        return Jwts.parser().setSigningKey(tokenSignKey)
                .parseClaimsJws(token).getBody().getSubject();
    }

    public String removeToken(String token) {
        /**
         * 逻辑处理
         */
        return getInfo(token);
    }
}
