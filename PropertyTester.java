package propertyManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTester {

	@Test
	void testProperty() {
		Property prop = new Property();
		assertEquals("",prop.getPropertyName());
		assertEquals("",prop.getCity());
		assertEquals("",prop.getOwner());
		assertEquals(0.0,prop.getRent());
	}

	@Test
	void testPropertyStringStringStringDouble() {
		Property prop= new Property("Property-1", "Rockville", "Joe", 3500);
		assertEquals("Property-1",prop.getPropertyName());
		assertEquals("Rockville",prop.getCity());
		assertEquals("Joe",prop.getOwner());
		assertEquals(3500,prop.getRent());
	}

	@Test
	void testPropertyProperty() {
		Property prop= new Property("Property-2", "Gaithersburg","Meri", 2500);
		Property obj2= new Property(prop);
		assertEquals(prop.getPropertyName(), obj2.getPropertyName());
		assertEquals(prop.getCity(), obj2.getCity());
		assertEquals(prop.getOwner(), obj2.getOwner());
		assertEquals(prop.getRent(), obj2.getRent());
	}

}
