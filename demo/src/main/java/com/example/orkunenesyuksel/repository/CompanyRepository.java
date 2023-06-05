package com.example.orkunenesyuksel.repository;

import com.example.orkunenesyuksel.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Custom queries and operations can be added here
}