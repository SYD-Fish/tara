package com.syd.tara;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.syd.tara.dao")
public class TaraApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaraApplication.class, args);
    }
}
