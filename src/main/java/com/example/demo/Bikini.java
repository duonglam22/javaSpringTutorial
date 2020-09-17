package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit {
    public Bikini() {
        System.out.println("Bikini instance contructor ");
    }
    @Override
    public void wear() {
        System.out.println("wear bikini");
    }
}
