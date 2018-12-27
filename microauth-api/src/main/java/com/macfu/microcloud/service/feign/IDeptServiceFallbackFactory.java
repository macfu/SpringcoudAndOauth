package com.macfu.microcloud.service.feign;

import com.macfu.microcloud.service.IDeptService;
import com.macfu.po.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: liming
 * @Date: 2018/12/27 11:00
 * @Description: IDeptService接口熔断机制的处理
 */
@Component
public class IDeptServiceFallbackFactory implements FallbackFactory<IDeptService> {

    @Override
    public IDeptService create(Throwable throwable) {
        return new IDeptService() {
            @Override
            public Dept get(long id) {
                Dept vo = new Dept();
                vo.setDanme("【error】Feign-Hystrix");
                vo.setDeptno(888888L);
                vo.setLoc("Consumer客户端提供");
                return vo;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
