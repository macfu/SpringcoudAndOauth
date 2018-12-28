package com.macfu.microcloud.service;

import java.util.Map;

/**
 * @Author: liming
 * @Date: 2018/12/28 10:32
 * @Description: 业务接口
 */
public interface IClientService {
    /**
     * 根据客户的编号(client_id)查询出客户的信息以及对应的授权内容
     * @param clientId 客户端id
     * @return 返回的数据包含有如下内容：
     * key = client,value = Client对象，如果不存在则为null
     * key = allAuthorities,value = 当client信息存在时获取授权内容
     */
    Map<String, Object> get(String clientId);
}
