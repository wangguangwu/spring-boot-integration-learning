package com.wangguangwu.junit;

import com.wangguangwu.junit.controller.HelloController;
import com.wangguangwu.junit.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringBootIntegration02JunitApplicationTests {

    //=================注入========================

    @Resource
    private HelloController controller;

    @Resource
    private HelloService service;

    //=================测试方法======================

    @Test
    void contextLoads() {
    }

    @Test
    void controller() {
        controller.hello();
    }

    @Test
    void service() {
        service.hello();
    }
}
