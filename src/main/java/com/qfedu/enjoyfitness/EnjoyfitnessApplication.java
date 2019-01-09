package com.qfedu.enjoyfitness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2  //启用Swagger
@MapperScan(value = "com.qfedu.dao")
@ComponentScan(value = "com.qfedu")
public class EnjoyfitnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnjoyfitnessApplication.class, args);
    }

}

