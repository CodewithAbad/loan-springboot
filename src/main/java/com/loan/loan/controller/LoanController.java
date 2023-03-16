package com.loan.loan.controller;

import com.loan.loan.entity.Loan;
import com.loan.loan.service.LoanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanController {

    Logger logger = LoggerFactory.getLogger(LoanController.class);
    @Autowired
    private LoanService loanService;


    @PostMapping("/loans")
    public Loan save(@RequestBody Loan loan) {
        logger.debug("[create] inside loan saved successfully");
        return loanService.saveLoan(loan);
    }

    @PutMapping("/loans/{id}")
    public Loan update(@RequestBody Loan loan) {
        return loanService.updateLoan(loan);
    }

    @DeleteMapping("/loans/{id}")
    public Loan delete(@PathVariable("id") Long id) {
        return loanService.delete(id);
    }

    @GetMapping("/loans/{id}")
    public Optional<Loan> getLoansById(@PathVariable Long id) {
        return loanService.findById(id);
    }

    @GetMapping("/loans")
    public List<Loan> getAll() {
        return loanService.findAll();
    }
}