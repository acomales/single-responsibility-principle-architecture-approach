package com.productdock.srp.company.getcompanydetails;

import com.productdock.srp.entity.Company;
import lombok.Getter;

@Getter
public class GetCompanyDetailsResponse {

    private final String name;

    public GetCompanyDetailsResponse(final Company company) {
        this.name = company.getName();
    }
}
