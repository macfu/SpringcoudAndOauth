package com.macfu.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: liming
 * @Date: 2018/12/27 16:23
 * @Description: 消费端启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.macfu.microcloud"})
public class Consumer_80_StarterSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80_StarterSpringCloudApplication.class, args);
    }
}
