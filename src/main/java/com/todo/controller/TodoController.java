package com.todo.controller;

import com.todo.dao.Todo;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> getTodoList() {
        return service.getToDoList();
    }
    @PostMapping
    public int createTodoList(@RequestBody Todo todo) {
        return service.createToDoListService(todo);
    }

    @PatchMapping
    public int updateTodo(@RequestBody Todo todo) {
        return service.updateToDo(todo);
    }
    @DeleteMapping("/{seq}")
    public int deleteTodo(@PathVariable int seq) {
        return service.deleteToDo(seq);
    }

    @GetMapping("/{seq}")
     public Todo getSeqToDoList(@PathVariable int seq) {
         return service.getSeqToDoListService(seq);
    }
}
