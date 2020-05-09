/*Zuzanna Ciborowska
ADD'EM UP
n a CardFight® game, players are fighting each others by assembling a deck of cards and use strategy and tactics to defeat their opponents. Each card has a health point recorded as an integer. Cards with too low health points are quite useless in the battle arena.

However, low health point cards still have their value. CardFight® company is offering a conversion service, which is a machine allowing players to insert two cards, press a recycle button, and get output of one new card with a health point equals to the sum of the two original cards.

It seems there is no upper limit to the health points in cards produced by the machine. Hurray! By making good use of this conversion machine, you can trade-in your cards to get new cards with as high health points as you wish.

You know the business rule - nothing is free. Every time when you obtain a new card from the machine, you have to pay a service fee proportional to the health point on the new card. For example, if you insert an old 1-point card and another old 2-point card, you will obtain a new card of 3 points. CardFight® will debit you 3 dollars from your account.

When you have a stack of cards wishing to add up their points into a new card, you find that ordering can affect the final cost.

Say, you have three cards of points 1, 2 and 3.
Insert 1 and 2 to get a new card of 3 points. Cost $3.
You now have a new 3-point card and your origianl 3-point card.
Insert 3 and 3 to get a new card of 6 points. Cost $6.
Total cost is $9.

Doing it in another way.
Insert 2 and 3 to get a new card of 5 points. Cost $5.
You now have a new 5-point card and your origianl 1-point card.
Insert 1 and 5 to get a new card of 6 points. Cost $6.
Total cost is err... $11?!

Being a smart player you should find the best strategy to finish the trade-in with the lowest cost.*/

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine());
        
        ArrayList<Integer> X = new ArrayList<Integer>();
        
        for (String s : scanner.nextLine().split(" "))
        {
            X.add(Integer.parseInt(s));
        }
        
        int cost = 0;
        
        while (X.size() > 1)
        {
            Collections.sort(X);
            
            int minSum = X.get(0) + X.get(1);
            
            cost += minSum;

            X.remove(0);
            X.remove(0);
            X.add(minSum);
        }
        
        System.out.println(cost);
    }
}
