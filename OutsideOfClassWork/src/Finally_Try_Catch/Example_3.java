package Finally_Try_Catch;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Input a number: ");
            int number = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("Must input number only!");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("Out of Finally_Try_Catch");
    }
}
