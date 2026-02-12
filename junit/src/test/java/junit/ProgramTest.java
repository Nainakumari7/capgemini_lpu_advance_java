package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import junitcom.connectdatabase.EvenOrOdd;
import junitcom.connectdatabase.Program;

public class ProgramTest {
	
//	@ParameterizedTest
//	@ValueSource(strings= {"tenet", "radar","aba", "abcd"})
	public void isPalindromTest(String str) {
		Program p = new Program();
		assertTrue(p.isPalindrom(str));	
	}
//	@ParameterizedTest
//	@CsvSource({
//		"1,2,3",
//		"5,5,10",
//		"5,3,8"
//	})
	public void addTest(int a, int b, int expectedResult) {
		Program p = new Program();
		int actualres=p.add(a, b);
		assertEquals(expectedResult,actualres);
		
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/capgemini.csv", numLinesToSkip = 1)
	public void evenoroddTest(String input, String expected) {
		EvenOrOdd eoo = new EvenOrOdd();
		String actualres = eoo.evenOrOdd(Integer.parseInt(input));
		assertEquals(expected, actualres);
	}
}
