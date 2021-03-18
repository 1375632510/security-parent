package com.kris.auth.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Component
@ConfigurationProperties(prefix = "token")
@Data
public class TokenProperties {

    private Long time = 24 * 60 * 60 * 1000L;

    private String signKey = "kris";
}
