package com.example.configurationAndBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class SimpleBean {

    @Setter @Getter
    private String name;

    public SimpleBean(String name) {
        this.name = name;
    }
}
