package top.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.qq.service.MyService;

/**
 * 使用 @Configuration 编写自定义配置类
 */
@Configuration
public class MyConfig {
    //将该方法的返回值，作为一个 Bean 添加到 Spring 容器中
    //该Bean的id就是方法名

    @Bean
    public MyService myService(){
        return new MyService();

    }

}
