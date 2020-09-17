package com.example.accessDB;

import com.example.accessDB.GirlPlay;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class GirlRepositoryImpl implements GirlRepository {
    public GirlRepositoryImpl() {
        System.out.println("init GirlRepositoryImpl Object");
    }
    @Override
    public GirlPlay getGirlByName(String name) {
        return new GirlPlay(name);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct of GirlRepositoryImpl");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy of GirlRepositoryImpl");
    }
}
