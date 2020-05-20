/*Zuzanna Ciborowska
Write an application named UseInsurance that uses an abstract
Insurance class and Health and Life subclasses to display
different types of insurance policies and the cost per month. */

package com.company;

public abstract class Insurance {
    public String insurance;
    public double monthly_price;

    public Insurance(String insurance) {
        this.insurance = insurance;
    }

    public String getInsurance() {
        return insurance;
    }

    public double getMonthly_price() {
        return monthly_price;
    }

    public abstract void setCost();

    public abstract void display();
}
