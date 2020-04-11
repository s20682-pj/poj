/*Zuzanna Ciborowska
Write class to check if a number is Armstrong number or
not? (input 153 output true, 123 output false)
*/

package com.company;

public class Armstrong {

    public static boolean isArmstrong(int num) {

        int number, temp, total = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == num)
            return true;
        else
            return false;
    }
}
