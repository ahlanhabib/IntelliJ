package Static;

public class StaticVariable_Test {

	public static void main(String[] args) {

        StaticVariable.driveway = 10;     // class.variable

	    StaticVariable rocee = new StaticVariable();
		System.out.println(rocee.driveway);

		StaticVariable rabbil = new StaticVariable();
		System.out.println(rabbil.driveway);

		rabbil.driveway = 15;
		System.out.println(rocee.driveway);

	}
}
