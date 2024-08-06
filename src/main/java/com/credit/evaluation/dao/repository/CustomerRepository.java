package com.credit.evaluation.dao.repository;

import com.credit.evaluation.dao.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    CustomerEntity findByFinAndNationalIdNumber(String fin, String nationalIdNumber);
}
