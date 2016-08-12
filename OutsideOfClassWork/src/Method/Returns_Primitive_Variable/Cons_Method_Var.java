package Method.Returns_Primitive_Variable;

public class Cons_Method_Var {

    private int x;

    public Cons_Method_Var() {
        x = 15;
        System.out.println("Program entered here first.");
    }

    public int myMethod() {
        x = 30;
        return x;
    }

    public int myMethod1() {
        this.x = this.x + 50;
        return x;
    }

    public static void main(String[] args) {
        Cons_Method_Var obj = new Cons_Method_Var();
        System.out.println(obj.myMethod());
        System.out.println(obj.myMethod1());
    }
}

