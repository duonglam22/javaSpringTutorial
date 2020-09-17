package com.example.config;

import lombok.Getter;
import lombok.Setter;

public abstract class DatabaseConnector {
    @Setter @Getter
    private String url;

    /**
     *
     */
    public abstract void connect();
}
