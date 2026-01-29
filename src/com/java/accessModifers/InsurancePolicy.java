package com.java.accessModifers;

public class InsurancePolicy {
    private String policyNumber;
    private String policyHolderName;
    protected String insuranceCompany;

    public InsurancePolicy(String policyHolderName, String policyNumber, String insuranceCompany) {
        this.policyHolderName = policyHolderName;
        this.policyNumber = policyNumber;
        this.insuranceCompany = insuranceCompany;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public void showDetails()
    {

        System.out.println("Policy Number :"+policyNumber);
        System.out.println("Policy Holder :" +policyHolderName);
        System.out.println("Insurance Company :" +insuranceCompany);
    }
}
