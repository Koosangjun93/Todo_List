package com.example.demo.mapper;

import com.example.demo.domain.ToDoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToDoMapper {
    public List<ToDoDTO> selectToDoList();
}
