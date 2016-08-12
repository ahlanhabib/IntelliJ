package HW1;

public class Microsoft {
	Discount dis_Microsoft = new Discount();
	Sale itemOnSale = new Sale ();
	
	int MicrosoftPrice;
	String name;
	
		public void msTablet(String tablet){
			int total = dis_Microsoft.discount1(50, 50, 100);
			System.out.print(tablet + ", $" +total + " off: Now $899!!!, ");
			itemOnSale.noSale();
		}
		public void msGameConsole(String name){
			System.out.print(name);

		}
		public void msSoftware(){
			String name="Microsoft Office";
			System.out.print(name);
		}
		public void msPhone(){
			String name="Nokia Lumia";
			System.out.print(name);
		}
	
		public void msLive(){
			String name="Xbox Live";
			System.out.print(name);
		}

}
