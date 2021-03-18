package com.kris.base.config;

import com.kris.base.handler.MybatisPlusHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: chenyu
 * @Date: 2021/3/18
 */
@Configuration
@ComponentScan(basePackageClasses = {MybatisPlusHandler.class})
@Import({RedisConfig.class,SwaggerConfig.class})
public class SecurityBaseConfig {

}
