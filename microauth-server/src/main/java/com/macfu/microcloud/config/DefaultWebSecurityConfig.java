package com.macfu.microcloud.config;

import com.macfu.microcloud.security.util.DefaultUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @Author: liming
 * @Date: 2018/12/26 18:46
 * @Description: 用户安全配置类
 */
@Configuration
public class DefaultWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public UserDetailsService getUserDetailService() {
        return new DefaultUserDetailsService();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("mldn").password("hello").roles("USER");
        // 使用自定义用户认证
        auth.userDetailsService(this.getUserDetailService());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
    }
}
