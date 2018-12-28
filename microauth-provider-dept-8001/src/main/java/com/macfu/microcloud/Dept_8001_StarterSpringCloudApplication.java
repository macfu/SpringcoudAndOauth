package com.macfu.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * @Author: liming
 * @Date: 2018/12/27 14:31
 * @Description: 主程序启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Dept_8001_StarterSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8001_StarterSpringCloudApplication.class, args);
    }
}
