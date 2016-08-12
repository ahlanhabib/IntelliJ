package Switch_Case_Default;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Days obj = new Days();
        obj.myMethod();
    }
    void myMethod (){
        System.out.print("Type a day of the week: ");
        Scanner input = new Scanner(System.in);
        String days = input.nextLine();
        switch (days){
            case "monday":
                System.out.println("This is Monday!!");
                break;
            case "tuesday":
                System.out.println("This is tuesday!!");
                break;
            case "wednesday":
                System.out.println("This is wednesday!!");
                break;
            case "thursday":
                System.out.println("This is thursday!!");
                break;
            case "friday":
                System.out.println("This is friday!!");
                break;
            case "saturday":
                System.out.println("This is saturday!!");
                break;
            case "sunday":
                System.out.println("This is sunday!!");
                break;
            default:
                System.out.println("Default statements!!");
                break;
        }
    }
}
