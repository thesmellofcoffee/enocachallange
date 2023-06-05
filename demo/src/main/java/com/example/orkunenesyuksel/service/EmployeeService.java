package com.example.orkunenesyuksel.service;

import com.example.orkunenesyuksel.model.Employee;
import com.example.orkunenesyuksel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    // Diğer işlemler ve metotlar

}