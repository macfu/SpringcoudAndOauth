package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: liming
 * @Date: 2018/12/27 11:10
 * @Description: eureka服务启动程序类
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_StartSpringCloudApplication.class, args);
    }
}
