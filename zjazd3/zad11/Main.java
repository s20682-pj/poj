/*Employee
Zuzanna Ciborowska*/

package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Some","One", 4500);
        System.out.println(employee1.toString());
        employee1.setSalary(5000);
        System.out.println("New salary:" + employee1.getSalary());
        System.out.println("Annual Salary: " + employee1.getAnnualSalary());
        employee1.raiseSalary(10);
        System.out.println("Salary after payrise: " + employee1.getSalary());
    }
}
