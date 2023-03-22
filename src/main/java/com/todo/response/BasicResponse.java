package com.todo.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BasicResponse {
    private Integer code;
    private HttpStatus httpStatus;
    private String message;
    private List<Object> result;
}
