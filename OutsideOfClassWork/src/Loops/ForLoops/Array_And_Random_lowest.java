package Loops.ForLoops;
public class Array_And_Random_lowest {

    // find the lowest number in the array and print it

    public static void main(String[] args) {
        int []array = {9,8,2,6,4,1,3,5};
        int lowest = array[0];
        int highest = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (lowest>array[i]) { //If lowest=9, is larger than 8 then save 8 to lowest. Still Run!!!
                lowest = array[i];
            }if (lowest<array[i]) {//If lowest=9, is smaller than 8 then save 8 to highest. Still Run!!!
                lowest = array[i];
            }
        }
        System.out.println("The Lowest number is: "+ lowest);
        System.out.println("The highest number is: "+ highest);
    }
}
