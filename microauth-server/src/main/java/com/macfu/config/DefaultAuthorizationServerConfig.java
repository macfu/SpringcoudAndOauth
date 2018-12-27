package com.macfu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;

/**
 * @Author: liming
 * @Date: 2018/12/26 18:58
 * @Description: 授权服务配置
 */
@Configuration
public class DefaultAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                // client_id信息
                .withClient("cmacfu")
                // client_secret信息
                .secret("cjava")
                // 定义授权类型
                .authorizedGrantTypes("authorization_code")
                // 授权范围
                .scopes("webapp");
    }
}
