package com.example.demo.controller;

import com.example.demo.domain.ToDoDTO;
import com.example.demo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping(value = "/")
    public String todoList(Model model){
        List<ToDoDTO> toDoList = toDoService.selectToDoList();
        model.addAttribute("toDoList", toDoList);
        model.addAttribute("todo", new ToDoDTO());
        return "index";
    }
}
