package Loops.ForLoops;

import java.util.Random;

public class PrintRandomNumbers {
    // Print 10 random numbers from 1-100 using for loops
    public static void main(String[] args) {
        Random rnum = new Random();
        for (int i = 0; i <20 ; i++) { // Takes care of how many times? Here, 10 times.
            System.out.println(rnum.nextInt(100));
        }
    }
}