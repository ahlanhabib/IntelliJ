package Encapsulation;

public class InsutanceCompanyDatabase {

	public static void main(String[] args) {
		
		Patients patient1 = new Patients();
		patient1.setName("Ahlan Habib");
		patient1.setDob(1988);
		patient1.setPhoneNumber(2134791804);
		patient1.setAddress("360 S kenmore ave, Los angeles CA 90020.");
		
		System.out.println("Name:"+ patient1.getName() + ", DOB:"+patient1.getDob() +
				           ", Phone Number:"+patient1.getPhoneNumber()
				           + ", Address:" +patient1.getAddress());
		
		Patients patient2 = new Patients();
		patient2.setName("Ahasan Habib");
		patient2.setDob(1985);
		patient2.setPhoneNumber(2132457835);
		patient2.setAddress("360 S kenmore ave, Los angeles CA 90020.");
		
		System.out.println("Name:"+ patient2.getName() + ", DOB:"+patient2.getDob() +
				           ", Phone Number:"+patient2.getPhoneNumber()
				           + ", Address:" +patient2.getAddress());
		
		Patients patient3 = new Patients("Nazir Uddin", 1988, 1234, "Bangladesh");
		System.out.println("Name:"+ patient3.getName() + ", DOB:"+patient3.getDob() +
		           ", Phone Number:"+patient3.getPhoneNumber()
		           + ", Address:" +patient3.getAddress());
	}
}
