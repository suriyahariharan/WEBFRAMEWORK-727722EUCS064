package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.HariharanStudent;
import com.example.bidirection.model.HariharanStudentInfo;
import com.example.bidirection.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HariharanStudentController {
    public StudentService studentService;
    public HariharanStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public HariharanStudent postMethodName(@RequestBody HariharanStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public HariharanStudentInfo postMethodName(@RequestBody HariharanStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<HariharanStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}