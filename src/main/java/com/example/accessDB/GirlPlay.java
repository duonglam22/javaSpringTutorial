package com.example.accessDB;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GirlPlay {
    @Setter @Getter
    private String name;

    @Setter @Getter
    private int age;

    public GirlPlay(String name) {
        this.name = name;
    }


//    public
}
