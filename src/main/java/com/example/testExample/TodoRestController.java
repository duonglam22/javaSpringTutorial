package com.example.testExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TodoRestController implements TodoRepository{
    @Autowired
    TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> findALl() {
        return todoService.getAll();
    }

    @Override
    public List<Todo> findAll() {
        return null;
    }

    @Override
    public Todo findById(int id) {
        return null;
    }
}
