package com.springbootapi.springcrud.dao;

import com.springbootapi.springcrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
