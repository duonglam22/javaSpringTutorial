package com.example.restfulApi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
    public ErrorMessage() {
        System.out.println("init ErrorMessage object!");
    }
    private int statusCode;
    private String message;
}
