package com.java.polymarphism;

public class BankingSystem {

    // Method 1: Calculate balance with only initial balance
    double calculateBalance(double initialBalance) {
        return initialBalance;
    }

    // Method 2: Calculate balance with initial balance + deposit
    double calculateBalance(double initialBalance, double depositAmount) {
        return initialBalance + depositAmount;
    }

    // Method 3: Calculate balance with initial balance + deposit + interest
    double calculateBalance(double initialBalance, double depositAmount, double interestRate) {
        double interestAmount = (initialBalance + depositAmount) * interestRate;
        return initialBalance + depositAmount + interestAmount;
    }
}
