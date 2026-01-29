package com.java.inheritance;


//Create a base class BankAccount
// with attributes such as account number, account holder
//name, and balance. Include methods to deposit and display balance.

// Create a subclass
//SavingsAccount that adds an interest rate and a method to
// calculate and display interest.
public class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}


