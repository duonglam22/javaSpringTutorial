package com.example.configurationAndBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("beginning start application!");
        ApplicationContext context = SpringApplication.run(App.class, args);

        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println("Simple Bean: " + simpleBean.toString());
    }
}
