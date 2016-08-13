package Loops.ForLoops;

import java.util.Random;

public class Array_And_Random_lowest {

    //Put random numbers from 1-200 in an array of 10
    // find the lowest number in the array and print it
     int temp;
    public void find() {
        int[] array = {5,10,48,62,3,7,8,2};//new int[10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (array[i]<array[j]){
                    this.temp = array[i];
                    //System.out.println(array[i]);
                }
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        //Random rdum = new Random();
        //int[] array = {5,10,48,62,3,7,8,2};//new int[10];
        //for (int i = 0; i < array.length; i++) {     //For loops going from 0-10
            //array [i]= rdum.nextInt(200); //array[i] going from 0-10 and storing random numbers.
        //}
        Array_And_Random_lowest obj = new Array_And_Random_lowest();
        obj.find();
    }
}
