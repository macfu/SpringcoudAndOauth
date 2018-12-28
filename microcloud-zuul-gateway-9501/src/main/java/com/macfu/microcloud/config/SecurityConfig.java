package com.macfu.microcloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Author: liming
 * @Date: 2018/12/28 16:42
 * @Description: 安全配置类
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**")
                .authorizeRequests().anyRequest().authenticated()
                .and().authorizeRequests().antMatchers("/", "/anon").permitAll()
                .and().csrf().disable();
    }

    // 此时zuul的访问路径：http://localhost:9501/mldn-proxy/dept-proxy/dept/list
}
