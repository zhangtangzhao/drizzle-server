package com.drizzle.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.drizzle.server.mapper")
public class DrizzleServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrizzleServerApplication.class, args);
    }

}
