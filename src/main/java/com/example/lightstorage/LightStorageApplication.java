package com.example.lightstorage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.lightstorage.mapper")
@SpringBootApplication
public class LightStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LightStorageApplication.class, args);
    }

}
