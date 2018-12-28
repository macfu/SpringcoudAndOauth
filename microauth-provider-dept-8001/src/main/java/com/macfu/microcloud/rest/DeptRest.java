package com.macfu.microcloud.rest;

import com.macfu.microcloud.service.IDeptService;
import com.macfu.po.Dept;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: liming
 * @Date: 2018/12/27 14:45
 * @Description: 服务端返回消息feign接口
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;
    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/dept/discovery")
    public Object discovery() {
        return this.discoveryClient;
    }

    @RequestMapping("/dept/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId();
    }

    @GetMapping("/dept/get/{id}")
    public Object get(@PathVariable("id") Long id) {
        return this.deptService.get(id);
    }

    @PostMapping("/dept/add")
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept);
    }

    @GetMapping("/dept/list")
    @PreAuthorize("hasAuthority('ADMIM')")
    public Object list() {
        return this.deptService.list();
    }
}
