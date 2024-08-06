package com.credit.evaluation.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {

    private String name;

    private String surname;

    private String fatherName;

    private LocalDate birthDate;

    private Double salary;
}
