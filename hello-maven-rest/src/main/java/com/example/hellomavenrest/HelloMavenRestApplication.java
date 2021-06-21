package com.example.hellomavenrest;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloMavenRestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloMavenRestApplication.class, args);
        String[] objects = context.getBeanDefinitionNames();
        int count = context.getBeanDefinitionCount();
        System.out.println("Total: " + count);
    }

}
