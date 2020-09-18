package com.example.restfulApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Lưu ý, @RequestMapping ở class, sẽ tác động tới
 * tất cả các RequestMapping ở bên trong nó.
 *
 * Mọi Request ở trong method sẽ được gắn thêm prefix /api/v1
 */
@RestController
@RequestMapping("/api/v1")
public class RestApiController {
    private List<Todo> todoList = new CopyOnWriteArrayList<>();

    public RestApiController() {
        System.out.println("init RestApiController object!");
    }

    @PostConstruct
    public void init() {
        System.out.println("init RestApiController");
        todoList.add(null);
        Todo todo = new Todo();
        todo.setTitle("work");
        todo.setDetail("PR");
        todoList.add(todo);
    }

    @GetMapping("/todo")
    public List<Todo> getTodoList() {
        // @PathVariable lấy ra thông tin trong URL
        // dựa vào tên của thuộc tính đã định nghĩa trong ngoặc kép /todo/{todoId}
        System.out.println("return todoList with size: " + todoList.size());
        return todoList;
    }

    @GetMapping("/todo/{todoId}")
    public Todo getTodo(@PathVariable(name = "todoId") Integer todoId) {
        // @PathVariable lấy ra thông tin trong URL
        // dựa vào tên của thuộc tính đã định nghĩa trong ngoặc kép /todo/{todoId}
        System.out.println("return todo with id: " + todoId.toString());
        return todoList.get(todoId);
    }

     /*
    @RequestBody nói với Spring Boot rằng hãy chuyển Json trong request body
    thành đối tượng Todo
     */
    @PutMapping("/todo/{todoId}")
    public Todo editTodo(@PathVariable(name = "todoId") Integer todoId,
                         @RequestBody Todo todo) {
        System.out.println("edit todo id: " + todoId);
        todoList.set(todoId, todo);
        return todo;
    }

    @DeleteMapping("/todo/{todoId}")
    public ResponseEntity deleteTodo(@PathVariable(name = "todoId") Integer todoId) {
        System.out.println("remove todo id: " + todoId);
        todoList.remove(todoId.intValue());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/todo")
    public ResponseEntity addTodo(@RequestBody Todo todo) {
        System.out.println("add todo: " + todo.toString());
        todoList.add(todo);
        // Trả về response với STATUS CODE = 200 (OK)
        // Body sẽ chứa thông tin về đối tượng todo vừa được tạo.
        return ResponseEntity.ok().body(todo);
    }
}
