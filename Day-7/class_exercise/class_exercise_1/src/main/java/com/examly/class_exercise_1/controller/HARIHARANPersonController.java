package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.HARIHARANPerson;
import com.examly.class_exercise_1.service.HARIHARANPersonService;

@RestController
public class HARIHARANPersonController {

     @Autowired
     public HARIHARANPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<HARIHARANPerson> postMethodName(@RequestBody HARIHARANPerson entity) {

          HARIHARANPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<HARIHARANPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<HARIHARANPerson>> getMethodName() {

          List<HARIHARANPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<HARIHARANPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<HARIHARANPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<HARIHARANPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}