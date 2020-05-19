/*Zuzanna Ciborowska
Implement the following UML chart (Geometric, circle...) */

package com.company;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        percent /= 100.0;
        radius *= percent;
    }

}
