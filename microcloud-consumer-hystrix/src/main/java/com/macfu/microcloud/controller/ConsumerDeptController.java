package com.macfu.microcloud.controller;

import com.macfu.microcloud.service.IDeptService;
import com.macfu.po.Dept;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/27 16:45
 * @Description: controller
 */
@RestController
public class ConsumerDeptController {
    @Resource
    private IDeptService deptService;

    @RequestMapping("/consumer/dept/get")
    public Object getDept(long id) {
        return this.deptService.get(id);
    }

    @RequestMapping("/consumer/dept/list")
    public Object listDept() {
        return this.deptService.list();
    }

    @RequestMapping("/consumer/dept/add")
    public Object addDept(Dept dept) {
        return this.deptService.add(dept);
    }
}
