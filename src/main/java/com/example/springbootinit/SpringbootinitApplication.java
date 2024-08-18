package com.example.springbootinit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootinit.mapper")
public class SpringbootinitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootinitApplication.class, args);
    }

}
