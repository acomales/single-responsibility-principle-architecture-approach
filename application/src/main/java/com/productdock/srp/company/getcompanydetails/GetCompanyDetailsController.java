package com.productdock.srp.company.getcompanydetails;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetCompanyDetailsController {

    private final GetCompanyDetailsService getCompanyDetailsService;

    @GetMapping("/companies/{id}")
    public GetCompanyDetailsResponse get(@PathVariable String id) {
        return getCompanyDetailsService.get(id);
    }
}
