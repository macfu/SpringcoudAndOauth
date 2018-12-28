package com.macfu.microcloud.rest;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * @Author: liming
 * @Date: 2018/12/28 14:08
 * @Description: controller
 */
@org.springframework.web.bind.annotation.RestController
public class ResourceController {
    @RequestMapping("/user")
    public Principal resource(Principal user) {
        return user;
    }
}
