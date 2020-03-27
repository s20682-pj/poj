/*Czy jest palindromem
Zuzanna Ciborowska*/

package com.company;

public class Main {

    public static void main(String[] args) {
        Palindrom pal1 = new Palindrom("atakkata");
        System.out.println(pal1.isPalin());
        Palindrom pal2 = new Palindrom("muzorazdajjadzarozum");
        System.out.println(pal2.isPalin());
        Palindrom pal3 = new Palindrom("wódyżaldlażydów");
        System.out.println(pal3.isPalin());
    }
}
