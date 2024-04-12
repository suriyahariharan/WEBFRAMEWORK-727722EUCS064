package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("Durgaprasad");
        obj.setDoorNo(168);
        obj.setStreetName("Pannimadai st");
        obj.setPincode(641017);
        obj.setArea("Mango Garden");
        obj.setDistrict("Coimbatore");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}