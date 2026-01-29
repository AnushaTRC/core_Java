package com.java.polymarphism.methodoverriding;

public class HealthInsurance extends  InsurancePolicy{
    @Override
    public void show() {
        super.show();
        System.out.println("Health Insurance policy");
        System.out.println("Covers Medical expenses");
    }
}
