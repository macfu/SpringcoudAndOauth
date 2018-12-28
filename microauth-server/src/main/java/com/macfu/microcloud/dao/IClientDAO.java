package com.macfu.microcloud.dao;

import com.macfu.microcloud.po.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: liming
 * @Date: 2018/12/28 10:03
 * @Description:
 */
@Mapper
public interface IClientDAO {
    /**
     * 根据id进行客户信息的查询
     * @param clientid 客户id
     * @return 客户信息，如果不存在返回null
     */
    Client findById(@Param("clientid") String clientid);
}
