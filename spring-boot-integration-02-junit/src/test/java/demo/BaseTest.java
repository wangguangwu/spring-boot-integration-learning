package demo;

import org.junit.jupiter.api.*;

/**
 * <p>
 * `@After***` 同 `@Before***`
 *
 * @author wangguangwu
 */
class BaseTest {

    @BeforeEach
    void beforeEach() {
        // 在每个测试方法执行前执行
        System.out.println("Before each ...");
    }

    @AfterEach
    void afterEach() {
        // 在每个测试方法后执行
        System.out.println("After each ...");
    }

    @BeforeAll
    static void beforeAll() {
        // 在当前类中的所有测试方法之前执行
        System.out.println("Before all ...");
    }

    @AfterAll
    static void afterAll() {
        // 在当前类的所有测试方法之后执行
        System.out.println("After all ...");
    }

    @Test
    void hello() {
        // 标记一个测试方法
        System.out.println("Hello");
    }

    @Test
    void helloWorld() {
        System.out.println("Hello World");
    }

    @Test
    @Disabled
    void disabled() {
        // 单个方法可以执行，在直接测试整个类时不会执行
        System.out.println("disabled ...");
    }

    @Test
    @Tag("this method is been tagged")
    void tag() {
        // 标记和过滤
        // 会打出警告信息
        System.out.println("tag ...");
    }
}
