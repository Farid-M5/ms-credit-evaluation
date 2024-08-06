package com.credit.evaluation.service.impl

import com.credit.evaluation.dao.entity.CustomerEntity
import com.credit.evaluation.dao.repository.CustomerRepository
import com.credit.evaluation.mapper.CustomerMapper
import io.github.benas.randombeans.EnhancedRandomBuilder
import spock.lang.Specification


class CustomerServiceImplTest extends Specification {
    private random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build()
    private CustomerMapper mapper
    private CustomerServiceImpl customerService
    private CustomerRepository customerRepository

    void setup(){
        customerRepository = Mock()
        mapper = CustomerMapper.INSTANCE

        customerService = new CustomerServiceImpl(customerRepository, mapper)
    }

    def "retrieveUserDetails - success case"(){
        given:
        def customer = random.nextObject(CustomerEntity)

        when:
        def result = customerService.retrieveUserDetails(customer.fin, customer.nationalIdNumber)

        then:
        customerRepository.findByFinAndNationalIdNumber(customer.fin, customer.nationalIdNumber) >> customer
        result.name == customer.customerName
        result.surname == customer.customerSurname
        result.fatherName == customer.customerFatherName
        result.birthDate == customer.customerBirthDate
        result.salary == customer.customerCurrentSalary

    }

}
