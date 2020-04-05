/*Zuzanna Ciborowska
Implement the following UML chart (point and movablepoint)*/

package com.company;

import java.util.Arrays;
import java.util.List;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public List getSpeed(){
        return Arrays.asList(xSpeed,ySpeed);
    }

    public String toString(){
        return "(" + getX() + "," + getY() + "), speed = (" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public MovablePoint move(){
        this.xSpeed = getX() + xSpeed;
        this.ySpeed = getY() + ySpeed;
        return this;
    }
}
