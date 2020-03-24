package com.company;

public class Main {

    public static void main(String[] args) {
       InvoiceItem invoiceItem1 = new InvoiceItem("1","pen",3,4.20);
       System.out.println("ID: " + invoiceItem1.getID());
       System.out.println("Desc: " + invoiceItem1.getDesc());
       System.out.println(invoiceItem1.toString());
       invoiceItem1.setQty(4);
       System.out.println("New qty: " + invoiceItem1.getQty());
       invoiceItem1.setUnitPrice(5.10);
       System.out.println("New unitPrice: " + invoiceItem1.getUnitPrice());
       System.out.println("Total price: " + invoiceItem1.getTotal());
    }
}
