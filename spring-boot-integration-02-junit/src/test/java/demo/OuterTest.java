package demo;

import com.wangguangwu.junit.SpringBootIntegration02JunitApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 跟对应的启动类不在同包下，直接使用 @SpringBootTest 会提示 Test ignored.
 * 因为 SpringBoot 没有找到启动类的位置
 * <p>
 * 需要在 @SpringBootTest 注解上显示地声明主启动类的位置
 *
 * @author wangguangwu
 */
@SpringBootTest(classes = SpringBootIntegration02JunitApplication.class)
class OuterTest {

    @Test
    void print() {
        System.out.println("Hello World");
    }
}
