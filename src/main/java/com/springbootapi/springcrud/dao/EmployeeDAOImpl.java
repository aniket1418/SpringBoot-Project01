package com.springbootapi.springcrud.dao;

import com.springbootapi.springcrud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    //define fields for entity manager
    private EntityManager entityManager;
    //set up constructor injection
    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll(){
        // query create
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        //execute query and get the result list
        List<Employee> employees = theQuery.getResultList();
        //return the result
        return employees;
    }

    @Override
    public Employee findById(int theId) {
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        //save employee
        Employee dbEmploye = entityManager.merge(theEmployee);
        //return the Db employee
        return dbEmploye;
    }

    @Override
    public void deleteById(int theId) {
        //find hthe employee
        Employee theEmployee = entityManager.find(Employee.class, theId);
        //delete the employee
        entityManager.remove(theEmployee);
    }

}
