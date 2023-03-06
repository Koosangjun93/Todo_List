package com.todo.service;

import com.todo.dao.Todo;
import com.todo.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper mapper;

    @Override
    public Todo getSeqToDoListService(int seq) {
        return mapper.getSeqToDoList(seq);
    }

      @Override
      public int createToDoListService(Todo todo) {
          return mapper.createToDoList(todo);
    }
}
