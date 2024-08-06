package com.credit.evaluation.mapper

import com.credit.evaluation.dao.entity.CustomerEntity
import spock.lang.Specification
import io.github.benas.randombeans.EnhancedRandomBuilder

class CustomerMapperTest extends Specification {
    private random = EnhancedRandomBuilder.aNewEnhancedRandomBuilder().build()
    private CustomerMapper mapper

    void setup(){
        mapper = CustomerMapper.INSTANCE
    }

    def "entityToDto Mapping test"(){
        given:
        def customer = random.nextObject(CustomerEntity)

        when:
        def dto = mapper.entityToDto(customer)

        then:
        dto.name == customer.customerName
        dto.surname == customer.customerSurname
        dto.fatherName == customer.customerFatherName
        dto.birthDate == customer.customerBirthDate
        dto.salary == customer.customerCurrentSalary
    }
}
