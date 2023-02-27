package com.todo;

import lombok.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/")
//@RestController
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody

    public String hello() {
        return "tester";
    }
}
