/* Implement the following UML chart - Shape
Zuzanna Ciborowska*/

package com.company;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public void setHeight(double side) {
        super.setHeight(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public String toString(){
        return "Shape [color = " + getColor() + ", filled = " + isFilled() + "Square [ width = " + getWidth() + "height = " + getHeight() + "]]";
    }
}
