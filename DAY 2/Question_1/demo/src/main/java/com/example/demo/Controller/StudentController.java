package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class StudentController {
     @GetMapping("/start")
     public String WelcomeString(){
        return "welcome";
     }
}
