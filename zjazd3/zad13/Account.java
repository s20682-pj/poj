/*Account
Zuzanna Ciborowska*/

package com.company;

public class Account {
    private String ID;
    private String name;
    private int balance;

    public Account(){
        this.balance = 0;
    }

    public Account(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Account(String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        this.balance=this.balance+amount;
        return this.balance;
    }

    public int debit (int amount) {
        if (amount <= this.balance){
        this.balance = this.balance - amount;
        return this.balance;
        }
        else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public int transferTo (Account anotherAccount, int amount){
        if (amount <= this.balance ) {
            this.balance = this.balance - amount;
            anotherAccount.balance = anotherAccount.balance + amount;
            return this.balance;
        }
        else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public String toString(){
        return "Account[id: " + this.ID + ", name: " + this.name + ", balance: " + this.balance + "]";
    }
}
