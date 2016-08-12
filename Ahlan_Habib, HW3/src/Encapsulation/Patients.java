package Encapsulation;

public class Patients {
	
	private String name;
	private int dob;
	private int phoneNumber;
	private String address;
	
	public Patients (){
		
	}
		
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Patients(String name, int dob, int phoneNumber, String address) {
		super();
		this.name = name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
}
