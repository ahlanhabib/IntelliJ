package PPP.Package_1;

public class Variables {
    int day1 = 10;
    public int day2 = 20;
    protected int day3 = 30;
    private int day4 = 40;

     protected int myMethod() { // If I put public here the PPP_2 can access it. If not then only PPP_1 can.
        return day1 + day2 + day3 +day4;
    }
}
