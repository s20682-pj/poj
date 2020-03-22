/*Zuzanna Ciborowska
Kod Cezara*/

package com.company;

public class ceasar {
    public static char[] hashCesar(String input) {
        char[] charInput = input.toCharArray();
        for (int i=0; i < charInput.length; i++){
            if((int)charInput[i] >= 65 && (int)charInput[i] <= 87 || (int)charInput[i] >= 97 && (int)charInput[i] <= 119)
            {
                charInput[i]+=3;
            }
            if((int)charInput[i] >= 88 && (int)charInput[i] < 97) {
                int temp = (int)charInput[i] - 88;
                charInput[i] = (char)(temp+65);
            }
            if((int)charInput[i] >= 120 && (int)charInput[i] < 123) {
                int temp = (int) charInput[i] - 120;
                charInput[i] = (char) (temp + 97);

            }
        }
        return charInput;
    }
}
