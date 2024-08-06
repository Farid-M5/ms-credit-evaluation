package com.credit.evaluation.controller;

import com.credit.evaluation.model.dto.CustomerDto;
import com.credit.evaluation.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(params = {"fin, nationalIdNumber"})
    public CustomerDto revealCustomerDetails(@RequestParam("fin") String fin,
                                             @RequestParam("nationalIdNumber") String nationalIdNumber) {
        return customerService.retrieveUserDetails(fin, nationalIdNumber);
    }
}
