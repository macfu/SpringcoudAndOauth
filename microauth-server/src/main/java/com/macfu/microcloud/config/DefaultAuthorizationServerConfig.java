package com.macfu.microcloud.config;

import com.macfu.microcloud.security.util.DefaultClientDetailsService;
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
//        clients.inMemory()
//                // client_id信息
//                .withClient("cmldn")
//                // client_secret信息
//                .secret("cjava")
//                // 定义授权类型
//                .authorizedGrantTypes("authorization_code")
//                // 直接进行授权控制
//                .autoApprove(true)
//                // 授权范围
//                .scopes("webapp");
        clients.withClientDetails(new DefaultClientDetailsService());
    }
//    {"access_token":"185b8ce6-2078-4cf9-b84a-ab45e503be7d","token_type":"bearer","expires_in":43199,"scope":"webapp"}

}
