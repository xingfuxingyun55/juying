package com.juying.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//标注主程序
@SpringBootApplication
@ComponentScan(basePackages = {"com.juying.application","com.juying.juying_controller"})
public class JuyingProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JuyingProviderApplication.class, args);
    }

}
