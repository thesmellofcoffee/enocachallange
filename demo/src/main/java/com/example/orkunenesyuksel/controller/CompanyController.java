package com.example.orkunenesyuksel.controller;

import com.example.orkunenesyuksel.model.Company;
import com.example.orkunenesyuksel.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public Company addCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable Long id) {
        return companyService.getCompany(id);
    }

}