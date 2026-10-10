
package com.example.customerrewards.service;

import com.example.customerrewards.entity.Customer;
import com.example.customerrewards.entity.Transaction;
import com.example.customerrewards.repository.CustomerRepository;
import com.example.customerrewards.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class TransactionService {

    private final CustomerRepository customerRepository;
    private final TransactionRepository transactionRepository;
    private final RewardService rewardService;

    public TransactionService(
            CustomerRepository customerRepository,
            TransactionRepository transactionRepository,
            RewardService rewardService) {
        this.customerRepository = customerRepository;
        this.transactionRepository = transactionRepository;
        this.rewardService = rewardService;
    }

    public Transaction recordTransaction(
            Long customerId, BigDecimal amount, LocalDate date) {

        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() ->
                        new RuntimeException("Customer not found"));

        Transaction transaction =
                new Transaction(customer, amount, date);

        return transactionRepository.save(transaction);
    }

    public int calculateTransactionPoints(BigDecimal amount) {
        return rewardService.calculatePoints(amount);
    }
}
