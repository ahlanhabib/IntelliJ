package Method.Returns_Reference_Variable;

public class Rectangle {
    int length;
    int width;
    Rectangle(int l, int b) {
        System.out.println("Constructor, with values.");
        length = l;
        width = b;
    } Rectangle myMethod() {
        System.out.println("Method, returns object.");
        Rectangle rect = new Rectangle(10, 20);
        return rect;
    }
}   class RetOb {
        public static void main(String args[]) {
            Rectangle ob1 = new Rectangle(40,50);
            Rectangle ob2; //Class type variable
            ob2= ob1.myMethod(); // Class type variable can call method.
            System.out.println("ob1.length : " + ob1.length);
            System.out.println("ob1.breadth: " + ob1.width);

            System.out.println("ob2.length : " + ob2.length);
            System.out.println("ob2.breadth: " + ob2.width);
            System.out.println("ob1.breadth: " + ob1.width);
        }
    }
