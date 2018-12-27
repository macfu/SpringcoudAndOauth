package com.macfu.microcloud.service.commons.feign;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liming
 * @Date: 2018/12/27 11:03
 * @Description: 工具初始化类，在feign接口中使用
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public Logger.Level getFeignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("admin", "hello");
    }
}
