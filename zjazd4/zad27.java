/*POWER OF THOR - EPISODE 1
In this puzzle, you need to compare different values. You have to correlate character variables and integer variables.

A straightforward solution uses 8 conditions. There is a way to simplify it and use only 4 conditions.
Zuzanna Ciborowska*/

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        in.nextLine();

        // game loop
        while (true) {
            int E = in.nextInt(); 
            in.nextLine();

            String direction = "";
            if(LY > TY && TY < 17){
                TY++;
                direction+= "S";
            }
            if(LY < TY && TY > 0){
                TY--;
                direction+= "N";
            }
            if(LX > TX && TX < 39){
                TX++;
                direction+= "E";
            }
            if(LX < TX && TX > 0){
                TX--;
                direction+= "W";
            }
            System.out.println(direction); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
