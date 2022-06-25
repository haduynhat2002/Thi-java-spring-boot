package com.example.thijavaspringboot.servicve;

import com.example.thijavaspringboot.entity.Employee;
import com.example.thijavaspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository ;

    public Employee createEmployees(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}
