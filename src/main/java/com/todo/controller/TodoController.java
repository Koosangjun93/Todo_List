package com.todo.controller;

import com.todo.dao.Todo;
import com.todo.response.BasicResponse;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public BasicResponse getTodoList() {
        BasicResponse basicResponse = new BasicResponse();
        List<Todo> todoList = service.getToDoList();

        if(todoList.isEmpty()) {
            basicResponse = BasicResponse.builder()
                    .code(HttpStatus.NO_CONTENT.value())
                    .httpStatus(HttpStatus.NO_CONTENT)
                    .message("Todo 목록이 없습니다.")
                    .result(Collections.singletonList(todoList))
                    .build();
        } else {
            basicResponse = BasicResponse.builder()
                    .code(HttpStatus.OK.value())
                    .httpStatus(HttpStatus.OK)
                    .message("Todo 목록을 조회했습니다.")
                    .result(Collections.singletonList(todoList))
                    .build();
        }
        return basicResponse;
    }
    @PostMapping
    public int createTodoList(@RequestBody Todo todo) {
        BasicResponse basicResponse = new BasicResponse();

        return service.createToDoListService(todo);
    }

    @PatchMapping
    public int updateTodo(@RequestBody Todo todo) {
        return service.updateToDo(todo);
    }
    @DeleteMapping("/{seq}")
    public int deleteTodo(@PathVariable int seq) {
        return service.deleteToDo(seq);
    }

    @GetMapping("/{seq}")
     public Todo getSeqToDoList(@PathVariable int seq) {
         return service.getSeqToDoListService(seq);
    }
}
