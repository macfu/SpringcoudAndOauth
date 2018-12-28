package com.macfu.microcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:18
 * @Description: dao
 */
@Mapper
public interface IRoleDAO {
    Set<String> findAllByMember(String mid);
}
