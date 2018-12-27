package com.macfu.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: liming
 * @Date: 2018/12/27 16:05
 * @Description: 程序启动类
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9501_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9501_StartSpringCloudApplication.class, args);
    }

}
