package com.todo.service;

import com.todo.dao.Todo;

public interface TodoService {

    public List<Todo> getToDoList();
    public int updateToDo(Todo todo);

    int deleteToDo(int seq);


    Todo getSeqToDoListService(int seq);
     int createToDoListService(Todo todo);

}
