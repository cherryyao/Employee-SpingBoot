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
        return EmployeeList;
    }

    @Override
    public  List<Employee> addEmployees(int id,String name,int age,String gender){
        EmployeeList.add(new Employee(id,name,age,gender));
        return EmployeeList;
    }

    @Override
    public List<Employee> updateEmployee(int id,Employee employee){
        for (Employee oldEmployee:EmployeeList)
        {
            if (id == employee.getId()){
                oldEmployee.setName(employee.getName());
                oldEmployee.setAge(employee.getAge());
                oldEmployee.setGender(employee.getGender());
                System.out.println(oldEmployee);
            }
        }
        return EmployeeList;
    }

    @Override
    public List<Employee> deleteEmployee(int id){
        for(Employee oldEmployee:EmployeeList){
            if (id == oldEmployee.getId()){
                EmployeeList.remove(oldEmployee);
               return EmployeeList;
            }
        }
        return null;
    }

    @Override
    public Employee searchEmployee(int id){
        for(Employee oldEmployee:EmployeeList){
            if (id == oldEmployee.getId()){
                return oldEmployee;
            }
        }
        return null;
    }



}
