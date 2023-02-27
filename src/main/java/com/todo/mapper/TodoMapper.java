package com.todo.mapper;

import com.todo.dao.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface TodoMapper {
    List<Todo> getTodoList();
}
