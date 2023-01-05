package com.wangguangwu.junit.controller;

import com.wangguangwu.junit.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangguangwu
 */
@RestController
@RequestMapping("/wang")
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello Controller");
        helloService.hello();
        return "Hello";
    }
}
