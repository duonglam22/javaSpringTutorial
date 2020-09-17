package com.example.accessDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("begin run application!");
        ApplicationContext context = SpringApplication.run(App.class, args);

        GirlService girlService = context.getBean(GirlService.class);
        GirlPlay gp = girlService.getRandomGirl();
        System.out.println("instance of gp: " + gp);
    }
}
