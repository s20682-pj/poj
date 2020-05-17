/* Implement the following UML chart (Movable)
Zuzanna Ciborowska*/

package com.company;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "Rectangle: TopLeft(" + this.topLeft.x + "," + this.topLeft.y + "), "
                + "TopRight(" + this.bottomRight.x + "," + this.topLeft.y + "), "
                + "BottomRight(" + this.bottomRight.x + "," + this.bottomRight.y + "), "
                + "BottomLeft(" + this.topLeft.x + "," + this.bottomRight.y + ")";
    }

    @Override
    public void moveUp(){
        this.bottomRight.y -= bottomRight.ySpeed;
        this.topLeft.y -= topLeft.ySpeed;
    }

    public void moveDown(){
        this.bottomRight.y += bottomRight.ySpeed;
        this.topLeft.y += topLeft.ySpeed;
    }

    public void moveLeft(){
        this.bottomRight.x -= bottomRight.xSpeed;
        this.topLeft.x -= topLeft.xSpeed;
    }

    public void moveRight(){
        this.bottomRight.x += bottomRight.xSpeed;
        this.topLeft.x += topLeft.xSpeed;
    }
}
