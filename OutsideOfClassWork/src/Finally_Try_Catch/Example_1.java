package Finally_Try_Catch;

public class Example_1 {
    public static void main(String[] args) {
        try {
            System.out.println("1st statement of Try block");
            int num = 10/0;
            System.out.println(num);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception happened");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("Out of Finally_Try_Catch");
    }
}
