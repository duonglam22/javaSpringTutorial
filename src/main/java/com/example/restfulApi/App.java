package com.example.restfulApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("beginning start application!");
        ApplicationContext context = SpringApplication.run(App.class, args);
    }
}
