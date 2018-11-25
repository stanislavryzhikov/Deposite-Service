package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class depositServiceTest {
    @Test
    void calculateDepositWithInterest() {
        {
            depositService testDeposit = new depositService();
            double result = testDeposit.calculateDepositWithInterest(700000, 365, 8);
            assertEquals(756000.0, result);
        }
        {
            depositService testDeposit = new depositService();
            double result = testDeposit.calculateDepositWithInterest(1000000, 365, 13.5);
            assertEquals(1131500.0, result);
        }
        {
            depositService testDeposit = new depositService();
            double result = testDeposit.calculateDepositWithInterest(0, 365, 13.5);
            assertEquals(0, result);
        }
        {
            depositService testDeposit = new depositService();
            double result = testDeposit.calculateDepositWithInterest(1000000, 365, 0);
            assertEquals(1000000, result);
        }
    }
}