/*Implement the following UML chart (Customer and invoice)
Zuzanna Ciborowska*/

package com.company;

public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getAmountAfterDiscount(){
        Double dis = Double.valueOf(customer.getDiscount());
        double amountAfterDiscount = this.amount - (this.amount * (dis/100));
        return amountAfterDiscount;
    }
}
