package top.qq.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MyConfigTest {
    @Autowired
    private MyConfig myConfig;
    @Test
    void myTest(){
        myConfig.myService().sayHello();
    }

}