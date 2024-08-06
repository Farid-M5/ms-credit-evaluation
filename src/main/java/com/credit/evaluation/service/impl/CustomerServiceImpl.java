package com.credit.evaluation.service.impl;

import com.credit.evaluation.dao.repository.CustomerRepository;
import com.credit.evaluation.mapper.CustomerMapper;
import com.credit.evaluation.model.dto.CustomerDto;
import com.credit.evaluation.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDto retrieveUserDetails(String fin, String nationalIdNumber){
        var customerEntity = customerRepository.findByFinAndNationalIdNumber(fin, nationalIdNumber);
        return customerMapper.entityToDto(customerEntity);
    }
}
