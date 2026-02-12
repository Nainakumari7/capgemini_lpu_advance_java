package com.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
	
	public void addTest() {
		Calculator.add(20,30);	
	}
	
	
	@Test
	public void reverseTest() {
		String actualRes = Calculator.reverseString("data");
        // atad--->tad
		assertEquals("atad", actualRes);
	}
	
	@Test
	public void reverseTestNull() {
		String actualRes=Calculator.reverseString(null);
		assertEquals("llun", actualRes);
	}
	
	@Test
	public void testValidAge() {
		
		Employee e = new Employee(10, "Allen",-17,"CSE");
		assertTrue(e.isValidAge()); 
	}
	
	@Test
	public void testAEEx() {
		Calculator c = new Calculator();
		assertThrows(NullPointerException.class,()->{c.div(10,0);});
	}
	
	
	@Test
	public void testValidName() {
		Employee e1 = new Employee(10,"Bob",18,"CSE");
		assertTrue(e1.isValidName());
	}
}
