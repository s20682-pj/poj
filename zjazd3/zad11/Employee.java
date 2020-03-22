/*Employee
Zuzanna Ciborowska*/

package com.company;

public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int ID, String firstName, String lastName, int salary) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return this.ID;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return this.salary*12;
    }

    public int raiseSalary(int percent){
        this.salary =this.salary/percent + this.salary;
        return this.salary;
    }

    public String toString(){
        String tempString = "Employee[id=" + this.ID + ", name: " + this.firstName + this.lastName + ", salary: " + this.salary + "]";
        return tempString;
    }
}
