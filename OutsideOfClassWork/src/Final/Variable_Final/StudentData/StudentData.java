package Final.Variable_Final.StudentData;

public class StudentData{
    //Blank final variable
    final int ROLL_NO;

    public StudentData(int rnum){
        //It must be initialized in constructor
        ROLL_NO=rnum;
    }
    public void myMethod(){
        System.out.println("Roll no is:"+ROLL_NO);
    }
    public static void main(String args[]){
        StudentData obj=new  StudentData(1234);
        obj.myMethod();
    }
}
