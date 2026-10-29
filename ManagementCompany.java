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
public class ManagementCompany {
	public static final int MAXIMUM=5;
	private String name;
	private String taxId;
	private Property[] properties;
	private int propertyCount;
	
	public ManagementCompany(String companyName, String tax) {
		name=companyName;
		taxId=tax;
		propertyCount=0;
		properties= new Property[MAXIMUM];
	}

	public ManagementCompany(ManagementCompany obj2) {
		name=obj2.name;
		taxId=obj2.taxId;
		propertyCount=obj2.propertyCount;
		properties = new Property[MAXIMUM];
		for (int i=0; i<propertyCount; i++) {
			properties[i]= new Property(obj2.properties[i]);
		}
	}
	
	public int addProperty(Property p) {
		if (propertyCount>= MAXIMUM) {
			return -1;
		}
		properties[propertyCount]= new Property(p);
		return propertyCount++;
	}
	
	public double totalRent() {
		double totalRent=0.0;
		for (int i=0; i< propertyCount; i++) {
			totalRent+= properties[i].getRent();
		}
		return totalRent;
	}
	
	public int getPropertyCount() {
		return propertyCount;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Company Name: ").append(name).append(" Tax ID: ").append(taxId).append("\n");
		for (int i=0; i<propertyCount; i++) {
			str.append(properties[i].toString()).append("\n");
		}
		return str.toString();
	}
}
