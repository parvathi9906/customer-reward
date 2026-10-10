
package com.example.customerrewards.service;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class RewardService {

    public int calculatePoints(BigDecimal amount) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            return 0;
        }

        int points = 0;

        if (amount.compareTo(new BigDecimal("100")) > 0) {
            points += amount.subtract(new BigDecimal("100"))
                    .multiply(new BigDecimal("2"))
                    .intValue();
        }

        if (amount.compareTo(new BigDecimal("50")) > 0) {
            BigDecimal eligibleAmount =
                    amount.min(new BigDecimal("100"))
                    .subtract(new BigDecimal("50"));

            points += eligibleAmount.intValue();
        }

        return points;
    }
}
