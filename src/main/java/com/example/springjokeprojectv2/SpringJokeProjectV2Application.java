package com.example.springjokeprojectv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-configure.xml")
public class SpringJokeProjectV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringJokeProjectV2Application.class, args);
    }

}
