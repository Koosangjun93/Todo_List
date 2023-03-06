package com.todo.controller;

import com.todo.dao.Todo;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
=======

>>>>>>> 6e1d400d6505934fa33a6fd7231ea0edb7458d34

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService service;

    @PostMapping("/insert")
    public int createTodoList(@RequestBody Todo todo) {
        return service.createToDoListService(todo);
    }
<<<<<<< HEAD
    @PatchMapping("/todos")
    public int updateTodo(@RequestBody Todo todo) {
        return service.updateToDo(todo);
    }
    @DeleteMapping("/todos/{seq}")
    public int deleteTodo(@PathVariable int seq) {
        return service.deleteToDo(seq);
    }
=======


    @GetMapping("/select/{seq}")
     public Todo getSeqToDoList(@PathVariable int seq) {
         return service.getSeqToDoListService(seq);
    }

>>>>>>> 6e1d400d6505934fa33a6fd7231ea0edb7458d34
}
