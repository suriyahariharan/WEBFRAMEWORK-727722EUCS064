package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.HARAIHARANDoor;
import com.examly.springapp.repository.HARIHARANDoorRepo;

@Service
public class HARIHARANDoorService {
    @Autowired
    private HARIHARANDoorRepo doorRepo;

    public HARAIHARANDoor postData(HARAIHARANDoor door) {
        return doorRepo.save(door);
    }

    public List<HARAIHARANDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public HARAIHARANDoor updateDetail(int doorid, HARAIHARANDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<HARAIHARANDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<HARAIHARANDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public HARAIHARANDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}