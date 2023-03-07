package com.loan.loan.service;

import com.loan.loan.entity.Loan;

import java.util.List;
import java.util.Optional;

public interface LoanService {

    public Loan saveLoan(Loan loan);
    public Loan deleteSoft(Long id);

    abstract Optional<Loan> findById(Long Id);

    public List<Loan> findAll();
}
