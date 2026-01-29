package com.java.polymarphism;

import com.java.polymarphism.methodoverriding.HealthInsurance;
import com.java.polymarphism.methodoverriding.InsurancePolicy;

public class MainClass
{
    public static void main(String[] args) {
        BankingSystem account=new BankingSystem();
        double balance1 = account.calculateBalance(1000);
        double balance2 = account.calculateBalance(1000, 500);
        double balance3 = account.calculateBalance(1000, 500, 0.05);

        System.out.println("Balance with initial amount: " + balance1);
        System.out.println("Balance after deposit: " + balance2);
        System.out.println("Balance after deposit with interest: " + balance3);

        HealthInsurance policy=new HealthInsurance();
        policy.show();

    }
}
