package top.qq.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Data
@Component
public class Student {
    @Value("#{ 5*6 }")
    private Integer id;
    @Value("${student.name}")
    private String name;

//    @Value("${server.port}")
//    private String port;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return "student{" + "name='" + name + '\'' + '}';
    }

}
