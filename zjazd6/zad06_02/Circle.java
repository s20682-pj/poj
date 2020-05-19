/*Zuzanna Ciborowska
Implement the following UML chart (Geometric, circle...) */

package com.company;

public class Circle implements GeometricObject {
    protected double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }

    public double getArea(){
        double area = this.radius * this.radius * Math.PI;
        return area;
    }
}
