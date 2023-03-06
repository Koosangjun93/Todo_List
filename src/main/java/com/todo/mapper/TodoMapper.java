package com.todo.mapper;

import com.todo.dao.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TodoMapper {
    Todo getSeqToDoList(int seq);
    int createToDoList(Todo todo);
}
