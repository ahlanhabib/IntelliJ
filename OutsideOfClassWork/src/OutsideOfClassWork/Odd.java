package OutsideOfClassWork;
import java.util.Random;

public class Odd {

	public static void main(String[] args) {
		int [] array = new int [10];
		Random random = new Random();
		int i = 0;
		while(i<array.length){
			int a = random.nextInt();
			
			if (a%2==1){
				array[i]=a;
				i++;
			}
		}
	for (int j=0; j<array.length;j++){
		System.out.println(array[j]);
		}
}
}
	

