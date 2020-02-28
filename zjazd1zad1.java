/*Flagi
Zuzanna Ciborowska*/

package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj flagę (PL/JP):");
        String flag = scanner.nextLine();
        System.out.println("Podaj rozmiar (S/M/L):");
        String size = scanner.nextLine();

        if (flag.equals("PL")) {
            if (size.equals("S")) {
                System.out.println(" _ _ _ _ _ _ _ ");
                for (int i = 0; i < 3; i++) {
                    System.out.println("|             |");
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("---------------");
                }

            } else if (size.equals("M")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("|                            |");
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println("||||||||||||||||||||||||||||||");
                }
            } else if (size.equals("L")) {
                for (int i = 0; i < 15; i++) {
                    System.out.println("|                                           |");
                }
                for (int i = 0; i < 15; i++) {
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
                }
            }

        }

        if (flag.equals("JP")) {
            if (size.equals("S")) {
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 1; i++) {
                    System.out.println("|                    |");
                }
                System.out.println("|          -         |");
                System.out.println("|       |     |      |");
                System.out.println("|       |     |      |");
                System.out.println("|          -         |");
                for (int i = 0; i <1; i++) {
                    System.out.println("|                    |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _");
            }
        }

        if (flag.equals("JP")) {
            if (size.equals("M")) {
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 2; i++) {
                    System.out.println("|                                          |");
                }
                System.out.println("|                   ----                   |");
                System.out.println("|                |        |                |");
                System.out.println("|                |        |                |");
                System.out.println("|                   ----                   |");
                for (int i = 0; i <2; i++) {
                    System.out.println("|                                          |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            }
        }

        if (flag.equals("JP")) {
            if (size.equals("L")) {
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                for (int i = 0; i < 4; i++) {
                    System.out.println("|                                                                                      |");
                }
                System.out.println("|                                        ------                                        |");
                System.out.println("|                                     |          |                                     |");
                System.out.println("|                                    |            |                                    |");
                System.out.println("|                                     |          |                                     |");
                System.out.println("|                                        ------                                        |");
                for (int i = 0; i <4; i++) {
                    System.out.println("|                                                                                      |");
                }
                System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
            }
        }
    }
}
