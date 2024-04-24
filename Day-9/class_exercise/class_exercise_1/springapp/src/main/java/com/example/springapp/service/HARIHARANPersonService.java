package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.HARIHARANPerson;
import com.example.springapp.repository.HARIHARANPersonRepo;

@Service
public class HARIHARANPersonService {
    public HARIHARANPersonRepo personRepo;

    public HARIHARANPersonService(HARIHARANPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(HARIHARANPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<HARIHARANPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
