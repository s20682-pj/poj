/* Kalkulator BMI
Zuzanna Ciborowska */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost: (np.: 1.6)");
        float wzrost = scanner.nextFloat();
        System.out.println("Podaj wagę:");
        int waga = scanner.nextInt();

        double potega = Math.pow(wzrost,2);
        double wynik = waga/potega;

        System.out.println (wynik);

        if (wynik < 18.5 ) {
            System.out.print("niedowaga");
        }

        else if (wynik >= 18.5 && wynik < 25) {
            System.out.print("norma");
        }

        else if (wynik >= 25 && wynik < 30) {
            System.out.print("nadwaga");
        }

        else if (wynik >= 30) {
            System.out.print("otyłość");
        }
    }
}
