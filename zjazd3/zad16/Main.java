/*Zuzanna Ciborowska
Write a program to print the name, salary and date of joining of
8 employees in a company.
Use arrayList of objects. 
*/
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    ArrayList<String> name = new ArrayList<String>();
	    name.add ("John D");
	    name.add ("Steve T");
	    name.add ("Kate R");
	    name.add ("Steve F");
	    name.add("Phillip O");
	    name.add("Ann R");
	    name.add("Eve B");
	    name.add("Tom E");

	    ArrayList<String> salary = new ArrayList<String>();
	    salary.add("2000");
	    salary.add("2054");
	    salary.add("5478");
	    salary.add("8745");
	    salary.add("4587");
	    salary.add("2137");
	    salary.add("9875");
	    salary.add("5412");

	    ArrayList<String>  dateOfJoining = new ArrayList<String>();
	    dateOfJoining.add("20.11.2012");
	    dateOfJoining.add("01.10.2011");
	    dateOfJoining.add("26.01.2020");
	    dateOfJoining.add("12.03.2012");
	    dateOfJoining.add("09.10.2020");
	    dateOfJoining.add("12.05.2018");
	    dateOfJoining.add("11.02.2014");
	    dateOfJoining.add("17.08.2015");

	    int x = name.size();

	    for (int i = 0; i < x; i++){
	    	System.out.println(name.get(i) + " " + salary.get(i) + " " + dateOfJoining.get(i));
		}
    }
}
