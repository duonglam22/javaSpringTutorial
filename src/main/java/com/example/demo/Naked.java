package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("naked")
@Primary
public class Naked implements Outfit{

    public Naked() {
        System.out.println("Naked Contructor");
    }
    @Override
    public void wear() {
        System.out.println("nothing clothes");
    }
}
