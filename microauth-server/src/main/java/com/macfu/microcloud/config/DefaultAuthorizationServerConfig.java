package com.macfu.microcloud.config;

import com.macfu.microcloud.security.util.DefaultClientDetailsService;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/26 18:58
 * @Description: 授权服务配置
 */
@Configuration
public class DefaultAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    @Resource
    private RedisConnectionFactory redisConnectionFactory;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // 建议一个token存储的配置项，此时将token直接保存在redis之中
        endpoints.tokenStore(new RedisTokenStore(this.redisConnectionFactory));
    }

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
