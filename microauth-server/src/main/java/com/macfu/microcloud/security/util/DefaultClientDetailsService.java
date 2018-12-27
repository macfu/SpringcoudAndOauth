package com.macfu.microcloud.security.util;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import java.util.Arrays;

/**
 * @Author: liming
 * @Date: 2018/12/27 19:22
 * @Description: clientDetail(存储客户详情信息)
 */
public class DefaultClientDetailsService implements ClientDetailsService {
    // 正常来讲此方法需要接受clientId信息，如果现在有数据库，可以通过此信息进行数据的查询
    // 此次使用的时一个固定的用户名和密码
    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        BaseClientDetails clientDetails = new BaseClientDetails();
        clientDetails.setClientId("cmldn");
        clientDetails.setClientSecret("cjava");
        clientDetails.setAuthorizedGrantTypes(Arrays.asList("authorization_code"));
        clientDetails.setScope(Arrays.asList("webapp"));
        clientDetails.setAutoApproveScopes(clientDetails.getScope());
        return clientDetails;
    }
}
