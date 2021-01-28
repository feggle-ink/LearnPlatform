package com.platform.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.platform.cloud.platform.service.mapper")
public class PlatformServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformServiceApplication.class, args);
    }

}
