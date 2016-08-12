package Super.Method_Super;

public class Without_Overriding {
    void parent_method(){
        System.out.println("Parent class, method. ");
    }
}
class Child extends Without_Overriding {
    void child_method (){
        System.out.println("Child class, method. " );
    }

    void test_method(){
        child_method();
        parent_method();

    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.test_method();
    }
}