package com.macfu.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: liming
 * @Date: 2018/12/28 16:34
 * @Description: 资源服务访问的安全配置类
 */
@Configuration
@EnableResourceServer
public class ClientResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().exceptionHandling().authenticationEntryPoint(((httpServletRequest, httpServletResponse, e) ->
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED))).and().authorizeRequests().anyRequest().authenticated()
                .and().httpBasic();
    }
    // 配置完上述之后在此直接输入：http://localhost:8001/dept/list将无法进行访问
}
