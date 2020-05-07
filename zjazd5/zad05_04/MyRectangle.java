/*Zuzanna Ciborowska
Design a MyRectangle class which is composed of two MyPoint instances as
its top-left and bottom-right corners. Draw the class diagrams, write the
codes, and write the test drivers.*/

package com.company;

public class MyRectangle {
    private MyPoint topleft;
    private MyPoint bottomright;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topleft = new MyPoint(x1,y1);
        this.bottomright = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topleft, MyPoint bottomright) {
        this.topleft = topleft;
        this.bottomright = bottomright;
    }

    public String toString(){
        return "MyRectangle: TopLeft = (" + this.topleft.getX() + "," + this.topleft.getY() + ")"
                + ", TopRight = (" + this.bottomright.getX() + "," + this.topleft.getY() + ")"
                + ", BottomLeft = (" + this.topleft.getX() + "," + this.bottomright.getY() + ")"
                + ", BottomRight = (" + this.bottomright.getX() + "," + this.bottomright.getY() + ")";
    }

    public double getHeight(){
        double height = this.topleft.getY() - this.bottomright.getY();
        return height;
    }

    public double getWidth(){
        double width = this.bottomright.getX() - this.topleft.getX();
        return width;
    }

    public double getArea(){
        double area = this.getHeight() * this.getWidth();
        return area;
    }

    public double getCircumference(){
        double circumference = (2*this.getWidth()) + (2*this.getHeight());
        return circumference;
    }

    public double getDiagonal(){
        double diagonal = (getHeight()*getHeight()) + (getWidth()*getWidth());
        return Math.sqrt(diagonal);
    }
}
