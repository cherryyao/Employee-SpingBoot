package com.example.demo.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService implements EmployeeDao {
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list  = new ArrayList<>();
        list.add(new Employee(1,"Tom",21,"男"));
        return list;
    }
}
