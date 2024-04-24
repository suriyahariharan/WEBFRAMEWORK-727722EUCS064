package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.HARIHARANPerson;
import com.examly.class_exercise_1.repository.HARIHARANPersonRepo;

@Service
public class HARIHARANPersonService {

     @Autowired
     public HARIHARANPersonRepo personRepo;

     public HARIHARANPerson SaveEntity(HARIHARANPerson entity) {
          return personRepo.save(entity);

     }

     public List<HARIHARANPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<HARIHARANPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
