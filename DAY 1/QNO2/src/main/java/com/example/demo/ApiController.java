// package com.example.demo.controller;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class DemoController {
//     @GetMapping("")
//     // public String greeting(){
//     //     return "Welcome spring boot!";
//     }

    
// }
package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/studentName")
    public String summary(@RequestParam("studentname") String student) {
        return "Welcome " + student + "!";
    }
}


