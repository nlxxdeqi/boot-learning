package top.qq.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix="person") //配置文件中以person开头的全部属性注入
@Data
public class Person {
    private Integer id;
    private String name;
    private List<String> hobby;
    private String[] family;

    private Map<String,Object> map;

    private Pet pet;
}
