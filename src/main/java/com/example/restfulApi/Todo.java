package com.example.restfulApi;

import lombok.Data;

@Data
public class Todo {
    public Todo() {
        System.out.println("init Todo object!");
    }
    private String title;
    private String detail;
}
