/*Account
Zuzanna Ciborowska*/

package com.company;

public class Main {

    public static void main(String[] args) {
	    Account account1 = new Account("1","account no. 1", 100);
        Account account2 = new Account("2","account no. 2");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        account1.credit(1000);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        account1.debit(50);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        account2.debit(50);
        System.out.println("Account no. 2 balance: " + account2.getBalance());
        account1.transferTo(account2, 100);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        System.out.println("New account no. 2 balance: " + account2.getBalance());
    }
}
