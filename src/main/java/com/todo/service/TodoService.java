package com.todo.service;

import com.todo.dao.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getToDoList();
}