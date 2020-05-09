/*Zuzanna Ciborowska
Write a program called GradesStatistics, which reads in n grades (of int between 0 and
100, inclusive) and displays the average, minimum, maximum, median and standard
deviation. Display the floating-point values up-to 2 decimal places. Your output shall look
like:*/

package com.company;
import java.util.*;

public class GradesStatistics {
    public static void main(String[] args) {
        int students;
        int grade;
        int sum = 0;
        double average;
        double median = 0;
        double deviation = 0;

        ArrayList<Integer> grades = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        students = userInput.nextInt();

        if (students > 0 && students <= 100) {
            for (int i = 1; i <= students; i++) {
                //Scanner userInput = new Scanner(System.in);
                System.out.print("Enter the grade for student " + i + ": ");
                grade = userInput.nextInt();
                grades.add(grade);
                sum = sum + grade;
            }
            }

        System.out.println("The grades are: " + grades);

        Double sumd = Double.valueOf(sum);
        Double stud = Double.valueOf(students);
        average = sumd/stud;
        System.out.printf("The average is: %.2f \n", average);

        Collections.sort(grades);
        if (grades.size()%2 == 0) {
            median = ((double )grades.get(grades.size()/2) + (double) grades.get(grades.size()/2 - 1))/2;
        }
        else {
            median = (double) grades.get(grades.size() / 2);
        }
        System.out.printf("The median is: %.2f \n", median);

        System.out.println("The minimum is: " + Collections.min(grades));
        System.out.println("The maximum is: " + Collections.max(grades));

        int length = grades.size();
        double mean = sum / length;
        for(double num: grades) {
            deviation += Math.pow(num - mean, 2);
        }
        deviation = Math.sqrt(deviation/length);
        System.out.printf("The standard deviation is: %.2f ", deviation);
        }
    }
