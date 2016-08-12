package Constructors;

public class ComicBooks {
	String character;
	int hero;
	
	//Default Constructor
	public ComicBooks (){
		System.out.println("This is default Constructor.");
	}
	
	//Constructor with 1 input.
	public ComicBooks (String character){
		this.character = character;
		System.out.println("I like "+ character);
	}
	
	//Constructor with 2 input.
	public ComicBooks (String character, int hero){
		this.character = character;
		this.hero = hero;
		System.out.println(character + "He is #" + hero + " hero.");
	}	
}
