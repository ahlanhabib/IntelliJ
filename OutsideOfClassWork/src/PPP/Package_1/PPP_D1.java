package PPP.Package_1;

public class PPP_D1 {

    public static void main(String[] args) {
        Variables obj = new Variables();
        System.out.println("day1: " + obj.day1+ ", I can see in this class");
        System.out.println("day2: " + obj.day2+ ", I can see in this class");
        System.out.println("day3: " + obj.day3+ ", I can see in this class");
        System.out.println("day4, I can't see in this class");
        System.out.println("MyMethod working here, the addition is: "+obj.myMethod());
    }

}
