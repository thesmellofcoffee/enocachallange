package com.example.orkunenesyuksel.repository;

import com.example.orkunenesyuksel.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom queries and operations can be added here
}