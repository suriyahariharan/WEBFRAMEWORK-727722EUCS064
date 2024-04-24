package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.HARIHARANPerson;
import com.example.springapp.repository.HARIHARANPersonRepo;

@Service
public class PersonService {
    @Autowired
    private HARIHARANPersonRepo rep;

    public boolean post(HARIHARANPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<HARIHARANPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<HARIHARANPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
