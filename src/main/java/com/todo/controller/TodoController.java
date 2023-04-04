package com.todo.controller;

import com.todo.dao.Todo;
import com.todo.response.BasicResponse;
import com.todo.service.TodoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TodoService service;

    @GetMapping
    public BasicResponse getTodoList() {
        BasicResponse basicResponse = new BasicResponse();
        logger.info("INFO Level 테스트");
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
        int res = service.createToDoListService(todo);
        if(res > 0) {
            basicResponse = BasicResponse.builder()
                    .code(HttpStatus.OK.value())
                    .httpStatus(HttpStatus.OK)
                    .message("Todo 목록을 추가했습니다.")
                    .result(Collections.singletonList(res))
                    .build();
        }
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
