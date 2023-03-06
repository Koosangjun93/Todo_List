package com.todo.service;

import com.todo.dao.Todo;

public interface TodoService {

    Todo getSeqToDoListService(int seq);
     int createToDoListService(Todo todo);
}