package Examples.Fibonacci_Numbers;
import java.util.Scanner;

public class Fibonacci {
    // Print Fibonacci numbers, take input from user.
    public static void main(String[] args) {

        // Getting how many Fibonacci numbers to print from the user
        System.out.print("Enter how many Fibonacci number you want to see? ");
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        // First 2 numbers are done
        int firstNumber = 0;
        int secondNumber = 1;

        if (c==0){
            System.out.println("The sequence starts from 1, NOT 0");
        }else if (c==1){
            System.out.println(firstNumber);
        }else if (c==2){
            System.out.println(firstNumber);
            System.out.println(secondNumber);
        }else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);
            for (int i = 3; i <= c; i++) {
                int thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                System.out.println(thirdNumber);
            }
        }
    }
}
