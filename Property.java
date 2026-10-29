package propertyManager;
/*
 * Class: CMSC203 20978
 * Instructor: Ahmed Tarek
 * Description: Property Manager
 * Due: 10/28/2026
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Mia Wicksteed
*/
public class Property {
	private String propertyName;
	private String city;
	private String ownerName;
	private double rentAmount;
	
	public Property() {
		propertyName="";
		city="";
		ownerName="";
		rentAmount=0.0;
	}
	
	public Property(String propName, String cit, String owner, double rent) {
		propertyName=propName;
		city=cit;
		ownerName=owner;
		rentAmount=rent;
	}
	
	public Property(Property obj2) {
		propertyName=obj2.propertyName;
		city=obj2.city;
		ownerName=obj2.ownerName;
		rentAmount=obj2.rentAmount;
	}
	
	
	public void setPropertyName(String propName) {
		propertyName=propName;
	}
	public void setCity(String cit) {
		city=cit;
	}
	public void setOwner(String owner) {
		ownerName=owner;
	}
	public void setRent(double rent) {
		rentAmount=rent;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	public String getCity() {
		return city;
	}
	public String getOwner() {
		return ownerName;
	}

	public double getRent() {
		return rentAmount;
	}
	
	public String toString() {
		String str= String.format("Property: %s City: %s Owner: %s Rent: $%.2f", propertyName, city, ownerName, rentAmount);
		return str;
	}
}
