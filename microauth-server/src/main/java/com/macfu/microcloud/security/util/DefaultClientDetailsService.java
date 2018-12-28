package com.macfu.microcloud.security.util;

import com.macfu.microcloud.po.Client;
import com.macfu.microcloud.service.IClientService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: liming
 * @Date: 2018/12/27 19:22
 * @Description: clientDetail(存储客户详情信息)
 */
public class DefaultClientDetailsService implements ClientDetailsService {
    @Resource
    private IClientService clientService;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Map<String, Object> map = this.clientService.get(clientId);
        if (map.get("client") == null) {
            throw new ClientRegistrationException("客户" + clientId + "的信息不存在，无法进行OAuth认证处理");
        }
        Client client = (Client) map.get("client");
        BaseClientDetails clientDetails = new BaseClientDetails();
        clientDetails.setClientId(clientId);
        clientDetails.setClientSecret(client.getClientsecret());
        clientDetails.setAuthorizedGrantTypes(Arrays.asList(client.getAuthorizedgranttypes()));
        clientDetails.setScope(Arrays.asList(client.getScope()));
        clientDetails.setAutoApproveScopes(clientDetails.getScope());
        Set<String> auth = (Set<String>) map.get("allAuthorities");
        List<GrantedAuthority> allGrantedAuthority = new ArrayList<GrantedAuthority>();
        Iterator<String> iter = auth.iterator();
        while (iter.hasNext()) {
            allGrantedAuthority.add(new SimpleGrantedAuthority(iter.next()));
        }
        clientDetails.setAuthorities(allGrantedAuthority);
        return clientDetails;
    }
//    // 正常来讲此方法需要接受clientId信息，如果现在有数据库，可以通过此信息进行数据的查询
//    // 此次使用的是一个固定的用户名和密码
//    @Override
//    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
//        BaseClientDetails clientDetails = new BaseClientDetails();
//        clientDetails.setClientId("cmldn");
//        clientDetails.setClientSecret("cjava");
//        clientDetails.setAuthorizedGrantTypes(Arrays.asList("authorization_code"));
//        clientDetails.setScope(Arrays.asList("webapp"));
//        clientDetails.setAutoApproveScopes(clientDetails.getScope());
//        return clientDetails;
//    }
}
