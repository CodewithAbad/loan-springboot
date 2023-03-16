package com.loan.loan.service;
import com.loan.loan.entity.Loan;
import java.util.List;
import java.util.Optional;

public interface LoanService {

    Loan saveLoan(Loan loan);
    Loan updateLoan(Loan loan);
    Loan delete(Long id);

    Optional<Loan> findById(Long id);

    List<Loan> findAll();
}
