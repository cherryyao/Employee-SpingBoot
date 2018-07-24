package com.example.demo.Dao;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
    List<Employee> addEmployees(int id,String name,int age,String gender);


    List<Employee> updateEmployee(int id,Employee employee);
}
