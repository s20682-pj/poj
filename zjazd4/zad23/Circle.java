/* Implement the following UML chart - Shape
Zuzanna Ciborowska*/

package com.company;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public String toString(){
        return "Shape [color = " + getColor() + ", filled = " + isFilled() + "Circle [ radius = " + this.radius + "]]";
    }
}
