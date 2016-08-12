package Polymorphism;

public class Z {
   public static void main (String args []) {
       X obj1 = new X(); 
       X obj2 = new Y(); // Method Overriding
       obj1.method1();
       obj2.method1();
   }
}
