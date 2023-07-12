package com.springbootapi.springcrud.rest;

import com.springbootapi.springcrud.dao.EmployeeDAO;
import com.springbootapi.springcrud.entity.Employee;
import com.springbootapi.springcrud.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    //inject employee dao
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //expose "/employee" return the list of all the employee
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

}
