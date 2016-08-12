package Super.Method_Super;

public class With_Overriding {
        void method(){
            System.out.println("Parent class, method. ");
        }
    }

class sub extends With_Overriding {
        void method(){
            System.out.println("Child class, method. " );
        }

        void test_method(){
            method();
            super.method();
        }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.test_method();
    }
}


