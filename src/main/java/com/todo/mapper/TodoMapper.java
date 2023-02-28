package com.todo.mapper;

import com.todo.dao.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TodoMapper {
    List<Todo> getTodoList();
    //void CreateTodoList(Todo todo);
    int createTodoList(Todo todo);

}
