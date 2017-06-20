package com.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration("classpath:application.yml")
public class RouteplanApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteplanApplication.class, args);
    }
}
