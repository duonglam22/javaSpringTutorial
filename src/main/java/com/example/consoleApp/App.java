package com.example.consoleApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    Hello hello;
    public static void main(String[] args) {
        System.out.println("beginning start application!");
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello appl console");
        hello.sayHello();
    }
}
