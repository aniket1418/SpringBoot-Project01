package com.springbootapi.springcrud.service;

import com.springbootapi.springcrud.dao.EmployeeDAO;
import com.springbootapi.springcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDao){
        employeeDAO = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
