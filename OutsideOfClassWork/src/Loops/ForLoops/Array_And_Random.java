package Loops.ForLoops;
import java.util.Random;
public class Array_And_Random {

    //Put random numbers from 1-200 in an array of 10
    //Print the numbers!!

    public static void main(String[] args) {
        Random rdum = new Random();
        int[] array = new int[10];                   //= {5,4,1,2,6,8,9};
        for (int i = 0; i <array.length; i++) {     //For loops going from 0-10
            array [i]= rdum.nextInt(200);          //array[i] going from 0-10 and storing random numbers.
            System.out.println(array[i]);
        }

    }
}
