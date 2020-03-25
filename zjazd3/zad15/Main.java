/*Time
Zuzanna Ciborowska*/

package com.company;

public class Main {

    public static void main(String[] args) {
	    Time time1 = new Time(3,3,3);
	    System.out.println("Hour:" + time1.getHour());
	    System.out.println("Minute: " + time1.getMinute());
	    System.out.println("Second: " + time1.getSecond());
	    time1.setHour(2);
	    time1.setMinute(0);
	    time1.setSecond(0);
	    System.out.println("New time: " + time1.toString());
	    System.out.println("Next second: " + time1.nextSecond());
	    System.out.println("Previous second: " + time1.previousSecond());
    }
}
