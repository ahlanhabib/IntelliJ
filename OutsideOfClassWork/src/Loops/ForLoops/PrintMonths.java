package Loops.ForLoops;

public class PrintMonths {
    String[] months = {"January", "February", "March", "April",
                        "May", "June", "July", "August",
                         "September", "October", "November", "December"};
    public void printMonth() {
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }
    }
    public static void main(String[] args) {
        PrintMonths obj = new PrintMonths();
        obj.printMonth();
    }
}
