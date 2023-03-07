package com.loan.loan.controller;
import com.loan.loan.entity.Loan;
import com.loan.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/saveLoan")
    public Loan save(@RequestBody Loan loan){
        return loanService.saveLoan(loan);
    }

    @DeleteMapping("/softDelete/{id}")
    public Loan deleteSoft(@PathVariable("id") Long id){
        return loanService.deleteSoft(id);
    }
    @GetMapping("/getOne/{Id}")
    public Optional<Loan> getLoansById(@PathVariable Long loanId){
        return loanService.findById(loanId);
    }

    @GetMapping("/getAll")
    public List<Loan> getAll(){
        return loanService.findAll();
    }
}


