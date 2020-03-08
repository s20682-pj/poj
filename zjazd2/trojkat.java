/*
Zuzanna Ciborowska
Stwórz klasę reprezentującą trójkąt, który musi posiadać atrybuty określające długości boków. 
Klasa powinna posiadać metody: obliczające pole, obwód,  isEquilateral, isIsosceles, or isScalene.
 */
package com.company;

public class trojkat {
    public double base;
    public double sideA;
    public double sideB;
    public double height;

    public void arearesult(double area){
        area=(base*height)/2;
    }

    public void perimeterresult(double perimeter){
        perimeter=base+sideA+sideB;
    }

    public void isEquilateral(){
        if(base==sideA){
            if(base==sideB){
                System.out.print("isEquilateral");
            }
            else{
                System.out.print("isNotEquilateral");
            }
        }
        else{
            System.out.print("isNotEquilateral");
        }
    }

    public void isIsosceles(){
        if (sideA==sideB){
            System.out.print("isIsosceles");
        }
        else{
            System.out.print("isNotIsosceles");
        }
    }

    public void isScalene(){
        if(base==sideA){
            System.out.print("isNotScalene");
        }
        else if (base==sideB){
            System.out.print("isNotScalene");
        }
        else if (sideA==sideB){
            System.out.print("isNotScalene");
        }
        else{
            System.out.print("isScalene");
        }
    }
}
