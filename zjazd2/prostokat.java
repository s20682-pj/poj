/*Zuzanna Ciborowska
Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość. 
Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
*/

package com.company;

public class prostokat {
    public int width;
    public int height;

    public void arearesult(int area){
        area = width*height;
    }

    public void perimeterresult(int perimeter){
        perimeter=2*width+2*height;
    }

    public void diagonalresult(double diagonal){
        diagonal = Math.sqrt((width * width) + (height * height));
    }
}
