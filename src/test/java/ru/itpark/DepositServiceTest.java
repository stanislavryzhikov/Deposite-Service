package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {
    @Test
    void calculateDepositWithInterest() {
        {
            DepositService testDeposit = new DepositService();
            double result = testDeposit.calculateDepositWithInterest(700_000, 365, 8);
            assertEquals(756_000.0, result);
        }
        {
            DepositService testDeposit = new DepositService();
            double result = testDeposit.calculateDepositWithInterest(1_000_000, 365, 13.5);
            assertEquals(1_131_500.0, result);
        }
        {
            DepositService testDeposit = new DepositService();
            double result = testDeposit.calculateDepositWithInterest(0, 365, 13.5);
            assertEquals(0, result);
        }
        {
            DepositService testDeposit = new DepositService();
            double result = testDeposit.calculateDepositWithInterest(1_000_000, 365, 0);
            assertEquals(1_000_000, result);
        }
    }
}