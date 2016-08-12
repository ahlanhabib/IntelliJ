package HomeOfficeShop_Test;

public class TestHomeOfficeShop {

	public static void main(String[] args) {
	Home homeTest = new Home();
	Office officeTest = new Office();
	Shop shopTest = new Shop();

	homeTest.bedroom1();
	homeTest.drawing();
	homeTest.bedroom2();
	homeTest.kitchen();
	
	System.out.println();
	System.out.println();

	officeTest.office1();
	officeTest.office2();
	officeTest.office3();
	officeTest.office4();
	
	System.out.println();
	System.out.println(homeTest.apt + " "+ homeTest.street );
	System.out.println();
	

	shopTest.shop1();
	shopTest.shop1();
	shopTest.shop1();
	shopTest.shop1();
	
	
	}

}
