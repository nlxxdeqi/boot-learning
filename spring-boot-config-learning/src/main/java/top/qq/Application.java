package top.qq;

import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath:beans.xml") //加载自定义的 XML 配置文件
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);


    }


}