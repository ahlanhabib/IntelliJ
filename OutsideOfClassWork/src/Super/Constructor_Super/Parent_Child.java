package Super.Constructor_Super;

public class Parent_Child { // This is Parent class or Super class.
    Parent_Child(){
        System.out.println("Default constructor, Parent class ");
    }
    Parent_Child (int number){
        System.out.println("Patent class Constructor with int. ");
    }

}

class Child extends Parent_Child{ // This is Child class or Sub class.

    Child (){
        System.out.println("Default constructor, Child class ");
    }
    Child (int num){
        super(5);
        System.out.println("This is Child class with int ");
    }
    void method1(){
        System.out.println("This is Method of Child_class ");
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.method1();
        System.out.println(" ");
        Child obj2 = new Child(5);
        obj1.method1();

    }
}