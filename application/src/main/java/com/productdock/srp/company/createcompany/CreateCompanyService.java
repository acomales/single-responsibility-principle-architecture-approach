package com.productdock.srp.company.createcompany;

import com.productdock.srp.entity.Company;
import com.productdock.srp.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CreateCompanyService {

    private final CompanyRepository companyRepository;

    CompanyWeb create(CompanyWeb companyWeb) {
        Company createdCompany = companyRepository.save(companyWeb.toCompany());
        return CompanyWeb.toCompanyWeb(createdCompany);
    }
}
