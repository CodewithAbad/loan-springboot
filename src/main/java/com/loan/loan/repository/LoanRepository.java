package com.loan.loan.repository;

import com.loan.loan.entity.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends MongoRepository<Loan,Long> {


    List<Loan> findByIsDeleted(boolean value);

    Optional<Loan> findByLoanId(Long Id);
}
