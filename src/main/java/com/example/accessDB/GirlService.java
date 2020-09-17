package com.example.accessDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class GirlService {
    @Autowired
    private GirlRepository repository;

    public GirlService() {
        System.out.println("init GirlService object");
    }

    public GirlPlay getRandomGirl() {
        String name = randomGirlName(1);
        return repository.getGirlByName(name);
    }

    public String randomGirlName(int length) {
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return "Linh";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct of GirlService");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy of GirlService");
    }
}
