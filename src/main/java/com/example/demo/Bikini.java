package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("wear bikini");
    }
}
