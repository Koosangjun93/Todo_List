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

    @GetMapping("/selectSeq")
    public List<Todo> getSeqToDoList() {
        return service.getSeqToDoListService();
    }




}
