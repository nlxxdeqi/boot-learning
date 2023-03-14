package top.qq.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.qq.config.DBConfig;

@RestController
@AllArgsConstructor
public class DBController {

    private final DBConfig dbConfig;

//    public DBController(DBConfig dbConfig){
//        this.dbConfig=dbConfig;
//    }

    @GetMapping("/show")
    public String show(){
        return dbConfig.configure();
    }


}
