package com.example.testExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public TodoService() {
        System.out.println("init TodoService object!");

    }

    public int countTodo() {
        return todoRepository.findAll().size();
    }

    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}
