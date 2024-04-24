package com.example.day6cy.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cy.model.HARIHARAN;
import com.example.day6cy.repository.HARIHARANRepo;

@Service
public class HARIHARANService {
    public HARIHARANRepo employeeRepo;
    public HARIHARANService(HARIHARANRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean postEmployee(HARIHARAN employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<HARIHARAN> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<HARIHARAN> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<HARIHARAN>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}
