/* Zuzanna Ciborowska
Implement the following UML chart (for person)*/

package com.company;

public class Person {
    private String name;
    private String Address;

    public Person(String name, String address) {
        this.name = name;
        this.Address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String toString(){
        return "Person [name = " + this.name + ", address: " + this.Address + "]";
    }
}
