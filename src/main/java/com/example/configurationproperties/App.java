package com.example.configurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties
public class App implements CommandLineRunner {
    @Autowired
    ConfigReader configReader;
    public App(){
        System.out.println("init App object!");
    }

    public static void main(String[] args) {
        System.out.println("begining start application!");
        SpringApplication.run(App.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("config email: " + configReader.getEmail());
        System.out.println("config analytics: " + configReader.getGoogleAnalyticsId());
        System.out.println("author: " + configReader.getAuthors());
        System.out.println("map: " + configReader.getExampleMap());
    }

}
