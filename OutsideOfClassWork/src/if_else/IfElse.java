package if_else;

import java.util.Scanner;

public class IfElse {
        public static void main(String[] args) {
            System.out.println("Enter your age: ");
            Scanner in = new Scanner(System.in);
            int age = in.nextInt();

            if (age>=18){
            System.out.println("You can enter!!");
            } else {
            System.out.println("You are young, can't enter. 18");
            }
        }
}
