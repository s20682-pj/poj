/*Zuzanna Ciborowska
THE DESCENT
The Enterprise ship is in danger: drawn towards the surface of an unknown planet, it is at risk of crashing against towering mountains. Help Kirk and Spock destroy the mountains... Save the Enterprise!*/

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
import java.util.Scanner;

class Player
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //Game loop.
        while (true)
        {
            int max = 0;
            int maxIndex = -1;
            
            for (int i = 0; i < 8; i++)
            {
                //Read inputs.
                int mountainH = Integer.parseInt(scanner.nextLine());
                
                //Set highest mountain.
                if (mountainH > max)
                {
                    max = mountainH;
                    maxIndex = i;
                }
            }

            //Output highest mountain.
            System.out.println(maxIndex);
        }
    }
}
