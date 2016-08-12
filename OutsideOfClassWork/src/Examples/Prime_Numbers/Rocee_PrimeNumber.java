package Examples.Prime_Numbers;

import java.util.Scanner;

public class Rocee_PrimeNumber {
    // Input one value and check if that number is Prime
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean result = true;
        for (int x = 2; x<number; x++) {
            if (number % x == 0) {
                result = false;
            }
            if (result) {
                System.out.println(number + " is Prime");
                break;
            } else {
                System.out.println(number + " is not Prime");
                break;
            }
        }
    }
}
