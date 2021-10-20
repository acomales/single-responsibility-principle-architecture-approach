package com.productdock.srp.company.createcompany;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateCompanyController {

    private final CreateCompanyService createCompanyService;

    @PostMapping(value = "/companies")
    public CompanyWeb createCompany(@RequestBody final CompanyWeb companyWeb) {
        return createCompanyService.create(companyWeb);
    }
}
