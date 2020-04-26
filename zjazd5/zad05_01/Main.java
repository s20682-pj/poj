/*Zuzanna Ciborowska
Write a program that allocates 10 points in an array of MyPoint, and
initializes to (1, 1), (2, 2), ... (10, 10). */

package com.company;

public class Main {

    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }

        System.out.println(points[1].distance(1, 1));
        System.out.println(points[2].distance(points[5]));
        System.out.println(points[9].distance());
    }
}
