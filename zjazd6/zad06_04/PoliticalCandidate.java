/*Zuzanna Ciborowska
Create an interface called Runner. The interface has an abstract
method called run() that displays a message describing the meaning of
run to the class.
Create classes called Machine, Athlete, and
PoliticalCandidate that all implement Runner.*/

package com.company;

public class PoliticalCandidate implements Runner {

    @Override
    public void run() {
        System.out.println("Candidate for president");
    }
}
