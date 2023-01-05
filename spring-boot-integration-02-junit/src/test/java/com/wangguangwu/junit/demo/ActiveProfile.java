package com.wangguangwu.junit.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author wangguangwu
 */
@SpringBootTest
@ActiveProfiles("prod")
class ActiveProfile {

    @Value("${hello}")
    private String hello;

    @Test
    void active() {
        System.out.println(hello);
    }
}
