package com.todo.service;

import com.todo.dao.Todo;

public interface TodoService {
<<<<<<< HEAD
    public List<Todo> getToDoList();
    public int updateToDo(Todo todo);

    int deleteToDo(int seq);
=======

    Todo getSeqToDoListService(int seq);
     int createToDoListService(Todo todo);
>>>>>>> 6e1d400d6505934fa33a6fd7231ea0edb7458d34
}