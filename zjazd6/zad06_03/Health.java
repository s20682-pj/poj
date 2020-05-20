/*Zuzanna Ciborowska
Write an application named UseInsurance that uses an abstract
Insurance class and Health and Life subclasses to display
different types of insurance policies and the cost per month. */

package com.company;

public class Health extends Insurance {

    public Health(String insurance) {
        super(insurance);
        setCost();
    }

    @Override
    public void setCost() {
        this.monthly_price = 196;
    }

    @Override
    public void display() {
        System.out.println("Life insurance price is: " + this.monthly_price + "$");
    }
}
