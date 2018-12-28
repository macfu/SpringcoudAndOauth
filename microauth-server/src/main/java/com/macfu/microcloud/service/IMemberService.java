package com.macfu.microcloud.service;

import java.util.Map;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:43
 * @Description: 业务接口
 */
public interface IMemberService {
    /**
     * 根据指定用户编号查询用户信息以及用户对应的角色信息
     * @param mid 用户编号
     * @return
     * key = member,value = 用户信息，如果没有返回null
     * key = allRoles,value = 所有的角色信息
     */
    Map<String, Object> get(String mid);
}
