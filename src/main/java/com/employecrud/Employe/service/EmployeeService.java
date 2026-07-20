package com.employecrud.Employe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employecrud.Employe.entity.Employee;
import com.employecrud.Employe.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService (EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }

    public Employee savEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
        
    }

    
}
