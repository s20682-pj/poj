/*Zuzanna Ciborowska
Implement the following UML chart (point and movablepoint)*/

package com.company;

import java.util.Arrays;
import java.util.List;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public List getXY(){
        return Arrays.asList(x,y);
    }

    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    }
}
