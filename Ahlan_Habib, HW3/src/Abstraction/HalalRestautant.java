package Abstraction;

public class HalalRestautant extends BangaliRestaurant implements Restaurant, FoodTruck {

	public void workers (){
		System.out.println("There will be 10 workers. ");
	}
	public void location() {
		System.out.println("The location of this Restautant is in Los Angeles.");
	}
	public void size() {
		System.out.println("We need to talk about the size of the Restaurant.");
	}
	public void name() {
		System.out.println("The name of this Restaurant is Pordesh.");
	}
	public void menu() {
		System.out.println("Let's find a Template for the Menu. ");
	}
	public void TruckLocation() {
		System.out.println("The food truck will be inside LACC. ");
		
	}
}
