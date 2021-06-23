package com.example.hellomavenrest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//public class HelloMavenRestApplication implements CommandLineRunner {
public class HelloMavenRestApplication{

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HelloMavenRestApplication.class, args);
        String[] objects = context.getBeanDefinitionNames();
        int count = context.getBeanDefinitionCount();
        System.out.println("Total: " + count);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Starting...");
//        System.out.println("Finish...");
//    }
}
