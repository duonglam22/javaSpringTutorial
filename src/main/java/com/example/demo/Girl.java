package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("girl")
public class Girl {
    @Autowired
    @Qualifier("bikini")
    Outfit outfit;

    public Girl(/*@Qualifier("bikini")Outfit outfit */) {
        System.out.println("Girl contructor");
//        this.outfit = outfit;
    }

    @PostConstruct
    public void postContructor() {
        System.out.println("post construct of girl object");
    }

    @PreDestroy
    public void preDestrouy() {
        System.out.println("predestoy girl object");
    }
}
