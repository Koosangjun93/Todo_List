package com.todo.controller;

import com.todo.dao.Todo;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/todos")
    public List<Todo> getTodos() {
        return service.getToDoList();
    }
    @PatchMapping("/todos")
    public int updateTodo(@RequestBody Todo todo) {
        return service.updateToDo(todo);
    }
    @DeleteMapping("/todos/{seq}")
    public int deleteTodo(@PathVariable int seq) {
        return service.deleteToDo(seq);
    }
}
