package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.HARIHARANPerson;
import java.util.List;


@Repository
public interface HARIHARANPersonRepo extends JpaRepository<HARIHARANPerson,Integer>{

    List<HARIHARANPerson> findByNameStartingWith(String name);
    List<HARIHARANPerson> findByNameEndingWith(String name);
    
}
