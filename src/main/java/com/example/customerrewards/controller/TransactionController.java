
package com.example.customerrewards.controller;

import com.example.customerrewards.entity.Transaction;
import com.example.customerrewards.service.TransactionService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction recordTransaction(
            @RequestParam Long customerId,
            @RequestParam BigDecimal amount,
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate date) {

        return transactionService.recordTransaction(
                customerId, amount, date);
    }

    @GetMapping("/points")
    public int calculatePoints(@RequestParam BigDecimal amount) {
        return transactionService.calculateTransactionPoints(amount);
    }
}
