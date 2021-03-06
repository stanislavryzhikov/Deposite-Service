package ru.itpark;

public class DepositService {
    public double calculateDepositWithInterest(double depositAmount, int depositTerm, double depositPercentage ) {
        double taxDeducted = 0;
        if (depositPercentage > 12.5)
        {
            double tax = 35;
            double taxed = depositAmount * (depositPercentage - 12.5) / 100;
            taxDeducted = (taxed * tax) / 100;
            System.out.println("Удержано налогов: " + taxDeducted);
        }
        double result = depositAmount + (depositAmount * (depositTerm / 365)  * (depositPercentage / 100)) - taxDeducted;
        return result;
    }
}
