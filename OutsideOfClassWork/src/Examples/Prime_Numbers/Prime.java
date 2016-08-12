package Examples.Prime_Numbers;

import java.util.Scanner;

public class Prime {
    // Input a number and check if it's a prime number.
    public static void main(String[] args) {
        int remainder;
        //boolean  itsPrime = true;
        boolean isPrime = true;
        System.out.print("Input a number more than 1: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int y = 2; y<n; y++)
            if (n%y == 0)
                isPrime = false;
        if (isPrime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " not prime");
        }
    }





//
//        for (int i = 2; i<=n/2; i++){
//           remainder = n%i;
//            if (remainder==0){
//                itsPrime = false;
//                break;
//            }
//        }
//        if (itsPrime)
//            System.out.println("This is a prime number");
//        else
//            System.out.println("This is not a prime number");

}
