package com.example.orkunenesyuksel.service;

import com.example.orkunenesyuksel.model.Company;
import com.example.orkunenesyuksel.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(long companyId) {
        companyRepository.deleteById(companyId);
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompany(long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    // Diğer işlemler ve metotlar

}