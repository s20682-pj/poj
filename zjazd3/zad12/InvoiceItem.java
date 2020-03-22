/*Zuzanna Ciborowska
InvoiceItem*/

package com.company;

public class InvoiceItem {
    private String ID;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String ID, String desc, int qty, double unitPrice) {
        this.ID = ID;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID() {
        return ID;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        double total = unitPrice*qty;
        return total;
    }

    public String toString() {
        return "InvoiceItem [id: " + this.ID + ", desc: " + this.desc + ", qty: " + this.qty + ", unitPrice: " + this.unitPrice + "]";
    }
}
