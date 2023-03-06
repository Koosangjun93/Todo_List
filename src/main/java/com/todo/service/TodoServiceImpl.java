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

<<<<<<< HEAD
    @Override
    public int updateToDo(Todo todo) {
        return mapper.updateTodo(todo);
    }

    @Override
    public int deleteToDo(int seq) {
        return mapper.deleteToDo(seq);
    }
}
=======
      @Override
      public int createToDoListService(Todo todo) {
          return mapper.createToDoList(todo);
    }
}
>>>>>>> 6e1d400d6505934fa33a6fd7231ea0edb7458d34
