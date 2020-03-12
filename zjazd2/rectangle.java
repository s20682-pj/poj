/*Zuzanna Ciborowska
Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. 
Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
*/

package com.company;

public class rectangle {
    public float width;
    public float height;
    
    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }
    
    public float getLenght() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void arearesult(float area){
        area = width*height;
    }

    public void circuitresult(float circuit){
        circuit=2*width+2*height;
    }

    public void diagonalresult(float diagonal){
        diagonal = Math.sqrt((width * width) + (height * height));
    }
}
