package com.java.inheritance;

public class HealthInsurance extends  InsurancePolicy{

    protected double hosptialCovergaeLimit;

    public HealthInsurance(String policyNumber, String policyHolderName, double policyAmount, double hosptialCovergaeLimit) {
        super(policyNumber, policyHolderName, policyAmount);
        this.hosptialCovergaeLimit = hosptialCovergaeLimit;
    }
    public  void displayDetails()
    {
        System.out.println("Policy Number          : " + policyNumber);
        System.out.println("Policy Holder Name     : " + policyHolderName);
        System.out.println("Policy Amount          : " + policyAmount);
        System.out.println("Hospital Coverage Limit: " + hosptialCovergaeLimit);
    }
}
