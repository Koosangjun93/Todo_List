package com.example.demo.service;

import com.example.demo.domain.ToDoDTO;
import com.example.demo.mapper.ToDoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService{
    @Autowired
    private ToDoMapper toDoMapper;

    @Override
    public List<ToDoDTO> selectToDoList() {
        List<ToDoDTO> todoList = toDoMapper.selectToDoList();
        return todoList;
    }
}
