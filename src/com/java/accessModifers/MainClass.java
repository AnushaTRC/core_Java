package com.java.accessModifers;

public class MainClass {

   public static void main(String[] args) {

       InsuranceSubClass sub=new InsuranceSubClass("Anusha","1245","Tata");

       sub.show();
       System.out.println("After updating data using setters");
       sub.setPolicyNumber("Poli1234");
       sub.show();
       System.out.println(sub.getPolicyHolderName());

       Customer cus=new Customer(100,"Megha");
       cus.setCustomerID(590);
       System.out.println("Customer ID: "+cus.getCustomerID());
       System.out.println("Customer Name :"+cus.getCustomerName());

    }
}
