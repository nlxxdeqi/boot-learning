package top.qq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevDBConfig implements DBConfig{

    @Override
    public String configure(){
        return "dev 环境数据库配置";
    }
}
