package com.example.configurationAndBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("init AppConfig object!");
    }
    @Bean
    SimpleBean simpleBeanConfigure() {
        return new SimpleBean("lam");
    }
}
