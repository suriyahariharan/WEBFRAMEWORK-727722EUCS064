package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.HariharanStudentInfo;

@Repository
public interface HariharanStudentInfoRepository extends JpaRepository<HariharanStudentInfo,Integer>{
    
}