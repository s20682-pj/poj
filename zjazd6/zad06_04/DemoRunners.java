/*Zuzanna Ciborowska
Create an interface called Runner. The interface has an abstract
method called run() that displays a message describing the meaning of
run to the class.
Create classes called Machine, Athlete, and
PoliticalCandidate that all implement Runner.*/

package com.company;

public class DemoRunners {
    public static void main(String[] args) {
        Machine mach = new Machine();
        Athlete ath = new Athlete();
        PoliticalCandidate can = new PoliticalCandidate();

        mach.run();
        ath.run();
        can.run();
    }
}
