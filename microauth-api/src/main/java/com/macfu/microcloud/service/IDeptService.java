package com.macfu.microcloud.service;

import com.macfu.microcloud.service.commons.feign.FeignClientConfig;
import com.macfu.microcloud.service.feign.IDeptServiceFallbackFactory;
import com.macfu.po.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/27 10:53
 * @Description: Dept暴露的Service接口
 */
@FeignClient(value = "MICROCLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class, fallback = IDeptServiceFallbackFactory.class)
public interface IDeptService {

    @RequestMapping(method = RequestMethod.GET, value = "/mldn-proxy/dept-proxy/dept/get/{id}")
    Dept get(@PathVariable("id") long id);

    @RequestMapping(method = RequestMethod.GET, value = "/mldn-proxy/dept-proxy/dept/list")
    List<Dept> list();

    @RequestMapping(method = RequestMethod.POST, value = "/mldn-proxy/dept-proxy/dept/add")
    boolean add(Dept dept);
}
