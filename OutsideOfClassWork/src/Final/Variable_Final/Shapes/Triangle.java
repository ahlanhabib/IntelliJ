package Final.Variable_Final.Shapes;

public class Triangle {

    int height = 5;
    final int weight= 15;

    public int areaOfTriangle (int height){
        this.height = height; //Changing the value of height.
        int area = (height*weight)/2;
        System.out.println("The Area of the Triangle is: "+area);
        return area;
    }
}
