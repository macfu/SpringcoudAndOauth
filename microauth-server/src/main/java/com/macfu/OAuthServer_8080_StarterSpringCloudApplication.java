package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @Author: liming
 * @Date: 2018/12/26 19:04
 * @Description: 主程序启动类
 */
@SpringBootApplication
@EnableAuthorizationServer
public class OAuthServer_8080_StarterSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAuthServer_8080_StarterSpringCloudApplication.class, args);
    }
}
