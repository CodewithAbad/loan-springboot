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
        return  loanRepository.save(loan);
    }

    @Override
    public Loan deleteSoft(Long id) {
        Loan loan = loanRepository.findById(id).orElseThrow( ()-> new IllegalArgumentException());
        if(null != loan){
            loan.setDeleted(true);
            loanRepository.save(loan);
        }
        return  loan;
    }

    @Override
    public Optional<Loan> findById(Long Id) {
        return loanRepository.findByLoanId(Id);
    }

    @Override
    public List<Loan> findAll() {
        return loanRepository.findByIsDeleted(false);
    }
}