/*Czy jest palindromem?
Zuzanna Ciborowska*/

package com.company;

public class Palindrom {
   private String palind;

    public Palindrom(String palind) {
        this.palind = palind;
    }

    public boolean isPalin(){
        int i = 0;
        int x = palind.length() - 1;
        while (i < x){
            if (palind.charAt(i) != palind.charAt(x))
                return false;
            i++;
            x--;
            }
            return true;
    }
}
