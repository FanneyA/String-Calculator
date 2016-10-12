package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0,calculator.add(""));
	}

	@Test 
	public void testOneNumber() {
		assertEquals(1,calculator.add("1"));
	}

	@Test 
	public void testTwoNumber(){
		assertEquals(3,calculator.add("1,2"));
	}
	@Test 
	public void testMultibleNumbers(){
		assertEquals(6,calculator.add("1,2,3"));
	
}

}