package Super.Variable_Super;

public class Parent_Child {
    int num1 = 10; // Variable name same as Child class.
}
class Child extends Parent_Child{
    int num1=15;  // Variable name same as Parent class.
    void method2 (){
        int num4 = num1*100;
        int num3 = super.num1*100;
        System.out.println(num3);
        System.out.println(num4);
    }

    public static void main(String[] args) {
        Child obj = new Child ();
        obj.method2();
    }
}