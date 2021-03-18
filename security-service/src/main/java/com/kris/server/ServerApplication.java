package com.kris.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: chenyu
 * @Date: 2021/3/17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(ServerApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOGGER.info("{}项目启动,地址：\thttp://{}:{}", env.getProperty("spring.application.name")
                , InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"));
    }
}
