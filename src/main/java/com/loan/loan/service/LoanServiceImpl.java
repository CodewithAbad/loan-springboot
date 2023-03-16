package com.loan.loan.service;

import com.loan.loan.entity.Loan;
import com.loan.loan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public Loan updateLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public Loan delete(Long id) {
        Loan loan = loanRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        if (null != loan) {
            loan.setDeleted(true);
            loanRepository.save(loan);
        }
        return loan;
    }

    @Override
    public Optional<Loan> findById(Long id) {
        return loanRepository.findByLoanId(id);
    }

    @Override
    public List<Loan> findAll() {
        return loanRepository.findByIsDeleted(false);
    }
}