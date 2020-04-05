/*Zuzanna Ciborowska
Implement the following UML chart (point 2d and 3d)*/

package com.company;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        return Arrays.asList(getX(),getY(),z);
    }

    public String toString(){
        return "(" + getX() + "," + getY() + "," + this.z + ")";
    }
}
