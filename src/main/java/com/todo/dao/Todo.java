package com.todo.dao;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Todo {
    private int seq;
    private String title;
    private String deadline;
    private boolean useYn;
    private String description;
    private String createTime;

}
