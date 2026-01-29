package com.java.inheritance;

//Create a base class InsurancePolicy with policy number, policy holder name, and policy
//amount.
// Create a subclass HealthInsurance that adds hospital coverage limit and displays full
//policy details.
public class InsurancePolicy {
    protected String policyNumber;
    protected String policyHolderName;
    protected double policyAmount;

    public InsurancePolicy(String policyNumber, String policyHolderName, double policyAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.policyAmount = policyAmount;
    }

    protected void showDetails() {
    }
}
