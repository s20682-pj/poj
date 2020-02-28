/*Kalkulator zapotrzebowania na kalorie
Zuzanna Ciborowska */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Podaj płeć (F/M):");
        String plec  = scanner.nextLine();
        System.out.println("Podaj wzrost: (np.: 160)");
        int wzrost = scanner.nextInt();
        System.out.println("Podaj wagę:");
        int waga = scanner.nextInt();
        System.out.println("Podaj wiek:");
        int wiek = scanner.nextInt();

        double wynik = 0;

        if(plec.equals("F")){
            wynik = 655.1 + (9.563*waga) + (1.85*wzrost) - (4.676*wiek);
            System.out.println(wynik);
        }
        else if (plec.equals("M")){
            wynik = 66.5 + (13.75*waga) + (5.003*wzrost) - (6.775*wiek);
            System.out.println(wynik);
        }

    }
}
