package com.macfu.microcloud.service.impl;

import com.macfu.microcloud.dao.IAuthoritiesDAO;
import com.macfu.microcloud.dao.IClientDAO;
import com.macfu.microcloud.po.Client;
import com.macfu.microcloud.service.IClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liming
 * @Date: 2018/12/28 10:37
 * @Description: 业务实现
 */
@Service
public class ClientServiceImpl implements IClientService {
    @Resource
    private IClientDAO clientDAO;
    @Resource
    private IAuthoritiesDAO authoritiesDAO;

    @Override
    public Map<String, Object> get(String clientId) {
        Map<String, Object> map = new HashMap<>();
        Client client = this.clientDAO.findById(clientId);
        if (client == null) {
            map.put("allAuthorities", this.authoritiesDAO.findAllAuthoritiesByClient(clientId));
        }
        map.put("client", client);
        return map;
    }
}
