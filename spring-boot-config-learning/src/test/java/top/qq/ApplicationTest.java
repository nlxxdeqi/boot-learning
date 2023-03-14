package top.qq;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import top.qq.service.MyService;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ApplicationTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void iocTest(){
        MyService myService=applicationContext.getBean("myService",MyService.class);
        myService.sayHello();
    }


}