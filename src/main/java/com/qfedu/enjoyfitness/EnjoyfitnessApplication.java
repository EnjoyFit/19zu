package com.qfedu.enjoyfitness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan(value = "com.qfedu.dao")
@ComponentScan(value = "com.qfedu")
public class EnjoyfitnessApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnjoyfitnessApplication.class, args);
    }

}

