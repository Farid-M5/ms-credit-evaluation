package com.credit.evaluation.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "fin", nullable = false)
    private String fin;

    @Column(name = "national_id_number", nullable = false)
    private String nationalIdNumber;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "customer_surname", nullable = false)
    private String customerSurname;

    @Column(name = "customer_father_name", nullable = false)
    private String customerFatherName;

    @Column(name = "customer_birthday", nullable = false)
    private LocalDate customerBirthDate;

    @Column(name = "customer_current_salary")
    private Double customerCurrentSalary;
}
