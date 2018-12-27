package com.macfu.microcloud.service.impl;

import com.macfu.microcloud.dao.IDeptDAO;
import com.macfu.microcloud.service.IDeptService;
import com.macfu.po.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/27 14:42
 * @Description: Mapper实现接口
 */
@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO deptDAO;

    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    @Override
    public List<Dept> list() {
        return this.deptDAO.findAll();
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }
}
