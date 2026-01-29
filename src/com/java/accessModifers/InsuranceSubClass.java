package com.java.accessModifers;

public class InsuranceSubClass extends InsurancePolicy {

    public InsuranceSubClass(String policyHolderName, String policyNumber, String insuranceCompany) {
        super(policyHolderName, policyNumber, insuranceCompany);
    }

    public  void show()
    {
        super.showDetails();
    }
}
