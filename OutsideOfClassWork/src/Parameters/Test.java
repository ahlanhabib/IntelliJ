package Parameters;

public class Test {
	
	public static void main (String [] args){
		
		NumberStringChar address = new NumberStringChar();
	
		System.out.println("The total is: $"+address.add(10,30) +" for,");
		System.out.print(address.buildingNumber(360));
		System.out.print(address.streetName(" South kenmore Street "));
		System.out.println(address.aptNumber(302));
		System.out.print(address.cityAndStateName("Los Angeles, CA "));
		System.out.print(address.zipCode(90020));
		
	}

}
