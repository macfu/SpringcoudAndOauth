package com.macfu.microcloud.dao;

import com.macfu.microcloud.po.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: liming
 * @Date: 2018/12/28 15:14
 * @Description: dao接口
 */
@Mapper
public interface IMemberDAO {
    Member findById(@Param("mid") String mid);

}
