/*Zuzanna Ciborowska
Write an application named UseInsurance that uses an abstract
Insurance class and Health and Life subclasses to display
different types of insurance policies and the cost per month. */

package com.company;
import java.util.*;

public class UseInsurance {
    public static void main(String[] args){
        Insurance chooseInsurace;
        String choice;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you wanna Life (1) or Health (2) insurance?");
        choice = userInput.next();
        if (choice.equals("1")){
            chooseInsurace = new Life("Life insurance");
            chooseInsurace.display();
        }
        else if (choice.equals("2")){
            chooseInsurace = new Health("Health insurance");
            chooseInsurace.display();
        }
        else {
            System.out.println("Error");
        }
    }
}
