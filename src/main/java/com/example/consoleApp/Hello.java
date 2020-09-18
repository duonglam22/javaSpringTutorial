package com.example.consoleApp;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    public Hello() {
        System.out.println("init Hello object");
    }

    public void sayHello() {
        System.out.println("Hello cworld");
    }
}
