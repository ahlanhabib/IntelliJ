package Final.Variable_Final.Shapes;

public class Square  {

    final int weight;
    public Square (int length, int weight ){
        this.weight= weight; // I have to assign final value
                            //  inside the constructor.
        int area = length*weight;
        System.out.println("The Area of the Square is: "+area);
    }
}
