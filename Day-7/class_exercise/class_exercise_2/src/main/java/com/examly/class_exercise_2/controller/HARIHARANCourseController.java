package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.HARIHARANCourse;
import com.examly.class_exercise_2.service.CourseService;

@RestController
public class HARIHARANCourseController {

     @Autowired
     public CourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<HARIHARANCourse> postMethodName(@RequestBody HARIHARANCourse entity) {

          HARIHARANCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<HARIHARANCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<HARIHARANCourse>> getMethodName() {

          List<HARIHARANCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<HARIHARANCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<HARIHARANCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<HARIHARANCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}