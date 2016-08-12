package Final.Method_Final;

public class XYZ {
    final void demo (){
        System.out.println("This is Final method");
    }
//    THIS GIVES ERROR!!!
//    class ABC extends XYZ{
//        void demo(){
//            System.out.println("ABC Class Method");
//        }

        public static void main(String[] args) {
        XYZ obj = new XYZ();
        obj.demo();
    }
}
