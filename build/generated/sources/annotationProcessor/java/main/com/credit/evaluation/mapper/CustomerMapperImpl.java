package com.credit.evaluation.mapper;

import com.credit.evaluation.dao.entity.CustomerEntity;
import com.credit.evaluation.model.dto.CustomerDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-07T00:35:28+0400",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerEntity dtoToEntity(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustomerName( customerDto.getName() );
        customerEntity.setCustomerSurname( customerDto.getSurname() );
        customerEntity.setCustomerFatherName( customerDto.getFatherName() );
        customerEntity.setCustomerBirthDate( customerDto.getBirthDate() );
        customerEntity.setCustomerCurrentSalary( customerDto.getSalary() );

        return customerEntity;
    }

    @Override
    public CustomerDto entityToDto(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setName( customerEntity.getCustomerName() );
        customerDto.setSurname( customerEntity.getCustomerSurname() );
        customerDto.setFatherName( customerEntity.getCustomerFatherName() );
        customerDto.setBirthDate( customerEntity.getCustomerBirthDate() );
        customerDto.setSalary( customerEntity.getCustomerCurrentSalary() );

        return customerDto;
    }
}
