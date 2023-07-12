package com.springbootapi.springcrud.service;

import com.springbootapi.springcrud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
