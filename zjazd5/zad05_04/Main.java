/*Zuzanna Ciborowska
Design a MyRectangle class which is composed of two MyPoint instances as
its top-left and bottom-right corners. Draw the class diagrams, write the
codes, and write the test drivers.*/

package com.company;

public class Main {

    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle(1,5,8,1);
        System.out.println(rec.toString());
        System.out.println("Height:");
        System.out.println(rec.getHeight());
        System.out.println("Width:");
        System.out.println(rec.getWidth());
        System.out.println("Area:");
        System.out.println(rec.getArea());
        System.out.println("Circumference:");
        System.out.println(rec.getCircumference());
        System.out.println("Diagonal:");
        System.out.println(rec.getDiagonal());
    }
}
