/* Zuzanna Ciborowska
Piramida */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj wielkość? n = ");
            int n = in.nextInt();
            drawPyramid(n);
    }
    public static void drawPyramid(int n) {
        char[] alphabet = "abcdefghijklmnopqrstwuxyz".toCharArray();
        String newLine = System.getProperty("line.separator");
        if (n > 0)
        {
            System.out.print(alphabet[0] + newLine);
            for (int i = 1; i < n; i++) {
                int j = 0;
                while (j >= 0 && j < i){
                    System.out.print(alphabet[j]);
                    j++;
                }
                System.out.print(alphabet[j]);
                j = i - 1;
                while (j >= 0 && j < n){
                    System.out.print(alphabet[j]);
                    j--;
                }
                System.out.print(newLine);
            }
        }
    }
}
