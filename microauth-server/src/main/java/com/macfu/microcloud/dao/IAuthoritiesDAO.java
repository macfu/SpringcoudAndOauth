package com.macfu.microcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @Author: liming
 * @Date: 2018/12/28 10:06
 * @Description: dao接口
 */
@Mapper
public interface IAuthoritiesDAO {
    /**
     * 根据clientid查询出所有的授权信息
     * @param clientid 客户端id信息
     * @return 所有授权的信息
     */
    Set<String> findAllAuthoritiesByClient(String clientid);
}
