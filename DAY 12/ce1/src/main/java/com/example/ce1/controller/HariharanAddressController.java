package com.example.ce1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.HariharanAddress;
import com.example.ce1.service.AddressService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class HariharanAddressController {
    
    @Autowired
    AddressService addressService;

    @SuppressWarnings("null")
    @PostMapping("/address/employee/{id}")
    public ResponseEntity<HariharanAddress> postMethodName(@RequestBody HariharanAddress address,@PathVariable int id) {
        
        try{
            return new ResponseEntity<>(addressService.setAddressById(id, address),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
