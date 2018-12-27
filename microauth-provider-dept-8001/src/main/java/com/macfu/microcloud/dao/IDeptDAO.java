package com.macfu.microcloud.dao;

import com.macfu.po.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/27 14:36
 * @Description: 数据层接口 
 */
@Mapper
public interface IDeptDAO {
    boolean doCreate(Dept vo);

    Dept findById(@Param("deptno") Long deptno);

    List<Dept> findAll();
}
