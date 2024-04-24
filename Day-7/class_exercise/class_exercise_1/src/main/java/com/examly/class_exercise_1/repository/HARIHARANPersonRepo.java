package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.HARIHARANPerson;

/**
 * PersonRepo
 */
@Repository
public interface HARIHARANPersonRepo extends JpaRepository<HARIHARANPerson, Integer> {

     List<HARIHARANPerson> findByAge(int byAge);
}