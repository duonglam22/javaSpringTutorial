package com.example.security;

import com.example.restfulApi.ApiExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public App() {
        System.out.println("init App object");
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
