package com.productdock.srp.company.getcompanydetails;

import com.productdock.srp.entity.Company;
import com.productdock.srp.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
class GetCompanyDetailsService {

    private final CompanyRepository companyRepository;

    GetCompanyDetailsResponse get(String id) {
        return companyRepository.findById(id)
                .map(GetCompanyDetailsResponse::new)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Company not found"));
    }
}
