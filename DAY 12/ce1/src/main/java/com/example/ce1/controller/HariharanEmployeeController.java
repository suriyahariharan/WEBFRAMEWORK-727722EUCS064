package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.HariharanEmployee;
import com.example.ce1.service.EmployeeService;

@RestController
public class HariharanEmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public HariharanEmployee setMethod(@RequestBody HariharanEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<HariharanEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<HariharanEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
