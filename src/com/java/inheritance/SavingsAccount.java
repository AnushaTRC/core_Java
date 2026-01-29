package com.java.inheritance;

class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName,
                          double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate and display interest
    public void calculateAndDisplayInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest Amount: " + interest);
    }
}

