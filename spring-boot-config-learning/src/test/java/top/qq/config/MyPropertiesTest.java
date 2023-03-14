package top.qq.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import top.qq.prop.MyProperties;

@SpringBootTest
class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;

  @Test
    void testMyProperties(){
        System.out.println(myProperties);
    }

}