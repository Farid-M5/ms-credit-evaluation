package com.credit.evaluation.service;

import com.credit.evaluation.model.dto.CustomerDto;

public interface CustomerService {
    CustomerDto retrieveUserDetails(String fin, String passportNumber);

}
