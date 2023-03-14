package top.qq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")  //指定多环境配置类标示
public class TestDBConfig implements DBConfig{

    @Override
    public String configure() {
        return "test 环境数据库配置";
    }
}
