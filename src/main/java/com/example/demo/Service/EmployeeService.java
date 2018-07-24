package com.example.demo.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService implements EmployeeDao {

    private List<Employee> EmployeeList = new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
//        List<Employee> list  = new ArrayList<>();
//        list.add(new Employee(1,"Tom",21,"男"));
        return EmployeeList;
    }

    @Override
    public  List<Employee> addEmployees(int id,String name,int age,String gender){
        EmployeeList.add(new Employee(id,name,age,gender));
        return EmployeeList;
    }



}
