package com.wangguangwu.junit.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 跟启动类对应的测试类处于同包下，可以直接使用 @SpringBootTest 注解
 *
 * @author wangguangwu
 */
@SpringBootTest
class InnerTest {

    @Test
    void print() {
        System.out.println("Hello World");
    }
}
