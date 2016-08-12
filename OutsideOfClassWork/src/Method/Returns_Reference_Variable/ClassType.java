package Method.Returns_Reference_Variable;

public class ClassType {

    public ClassType() {
        System.out.println("This is Default Constructor");

    }
    ClassType (int a, int b) {
        System.out.println("This is Constructor with passing values");
        int cc = a + b;
        System.out.println(cc);
    }


    ClassType myMethod() {
        ClassType obj = new ClassType(10,30);
        return obj;
    }

    public static void main(String[] args) {
        ClassType obj1 = new ClassType();
        obj1.myMethod();
    }
}
