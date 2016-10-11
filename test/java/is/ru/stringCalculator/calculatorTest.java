package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	public static void main(String args[]){
		org.junit.runner.JUnitCare.main("is.ru.stringCalculator")
	}
	@Test
	public void testEmptyString(){
		assertEquals(0,Calculator.add(""));
	}
	@Test 
	public void testOneNumber(){
		assertEquals(1,Calculator.add("1"));
	}
	@Test 
	public void testTwoNumber(){
		assertEquals(1,Calculator.add("1,2"));
	}
	@Test 
	public void testMultibleNumbers(){
		assertEquals(1,Calculator.add("1,2,3"));
	}
}