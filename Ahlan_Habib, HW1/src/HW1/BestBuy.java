package HW1;

public class BestBuy {

	public static void main(String[] args) {
		
		Apple apple_Bestbuy = new Apple();
		Microsoft ms_Bestbuy = new Microsoft();
		Discount dis_Bestbuy = new Discount();
		
		apple_Bestbuy.appleDesktop();
		apple_Bestbuy.applePrice=1500;
		System.out.println("The price of iMac is: $" + apple_Bestbuy.applePrice);
		Sale saleBestBuy = new Sale();
		saleBestBuy.noSale();
		
		System.out.println();
		
		apple_Bestbuy.name = "MacBook Pro";
		int total = dis_Bestbuy.discount1(25, 50, 25);
		System.out.print(apple_Bestbuy.name + ", $"+ total + " off : Now $999!!!, ");
		apple_Bestbuy.appleLaptop();
		
		System.out.println();
		
		ms_Bestbuy.msTablet("Surface pro");
		
		System.out.println();
		
		apple_Bestbuy.applePhone("iPhone", 6);
		
		System.out.println();
		
		System.out.println("All these items below, are free ;P jk! ");
		ms_Bestbuy.msGameConsole("Xbox");
		System.out.print(", ");
		ms_Bestbuy.msSoftware();
		System.out.print(", ");
		ms_Bestbuy.msPhone();
		System.out.print(", ");
		ms_Bestbuy.msLive();
		System.out.print(".");
		


	}

}
