package HW1;

public class Apple {
	
	int applePrice;
	String name;
	
	public void appleLaptop(){
	Sale itemOnSale = new Sale ();
	itemOnSale.sale();
	}
	public void appleDesktop(){
		String name="Apple Desktop: iMac";
	System.out.println(name);
	}
	public void appleUltraBook(){
		String name="MacBook Air";
	System.out.println(name);
	}
	public void appleSetTopBox(){
		this.name="Apple TV";
	System.out.println(name);
	}
	public void applePhone(String phone, int model){
	System.out.print(phone + " " + model + " is: $650, ");
	Sale itemOnSale = new Sale ();
	itemOnSale.noSale();
	}
	
}
