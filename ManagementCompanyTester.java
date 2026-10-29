package propertyManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTester {
	private ManagementCompany company;
	@BeforeEach
	void setUp() throws Exception {
		company = new ManagementCompany("Campus Realty Managment", "123-45-6789");
		company.addProperty(new Property("House of the Rising Sun", "Transylvania", "Count Victor", 5499.99));
		company.addProperty(new Property("Moody Hollow", "Salem", "Hagatha", 750.0));
	}

	@AfterEach
	void tearDown() throws Exception {
		company=null;
	}

	@Test
	void testAddProperty() {
		assertTrue(company.toString().equals("Company Name: Campus Realty Managment Tax ID: 123-45-6789\n"
				+ "Property: House of the Rising Sun City: Transylvania Owner: Count Victor Rent: $5499.99\n"
				+ "Property: Moody Hollow City: Salem Owner: Hagatha Rent: $750.00\n"));
	    assertEquals(2, company.getPropertyCount());
	}

	@Test
	void testTotalRent() {
		assertEquals(6249.99,company.totalRent(), .0001);
	}

}
