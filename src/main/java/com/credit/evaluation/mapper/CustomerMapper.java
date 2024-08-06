package com.credit.evaluation.mapper;

import com.credit.evaluation.dao.entity.CustomerEntity;
import com.credit.evaluation.model.dto.CustomerDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target= "id", ignore = true)
    @Mapping(target= "fin", ignore = true)
    @Mapping(target= "nationalIdNumber", ignore = true)
    @Mapping(source = "name", target = "customerName")
    @Mapping(source = "surname", target = "customerSurname")
    @Mapping(source = "fatherName", target = "customerFatherName")
    @Mapping(source = "birthDate", target = "customerBirthDate")
    @Mapping(source = "salary", target = "customerCurrentSalary")
    CustomerEntity dtoToEntity(CustomerDto customerDto);

    @Mapping(source = "customerName", target = "name")
    @Mapping(source = "customerSurname", target = "surname")
    @Mapping(source = "customerFatherName", target = "fatherName")
    @Mapping(source = "customerBirthDate", target = "birthDate")
    @Mapping(source = "customerCurrentSalary", target = "salary")
    CustomerDto entityToDto(CustomerEntity customerEntity);
}
