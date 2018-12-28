package com.macfu.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: liming
 * @Date: 2018/12/28 14:18
 * @Description: 资源安全配置类
 */
@Configuration
// 标识现在启动的是一个资源范围项
@EnableResourceServer
public class DefaultResourceServerConfigAdapter extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().exceptionHandling().authenticationEntryPoint(((httpServletRequest, httpServletResponse, e)
                -> httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED))).and()
                .authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
