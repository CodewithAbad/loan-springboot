package com.loan.loan.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    private Long loanId;
    private String loanType;
    private String loanDescription;
    private int loanAmount;
    private String requestedDate;
    private String status;
    private boolean isDeleted =false;
}
