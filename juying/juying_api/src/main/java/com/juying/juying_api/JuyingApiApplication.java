package com.juying.juying_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JuyingApiApplication {

    public String name;

    public static void main(String[] args) {
        SpringApplication.run(JuyingApiApplication.class, args);
    }

}
