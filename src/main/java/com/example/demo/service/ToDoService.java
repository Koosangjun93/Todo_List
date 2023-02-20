package com.example.demo.service;

import com.example.demo.domain.ToDoDTO;

import java.util.List;

public interface ToDoService {
    public List<ToDoDTO> selectToDoList();
}
