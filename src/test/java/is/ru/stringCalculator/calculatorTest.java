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

	@Test 
	public void testNumbersByNewLine(){
		assertEquals(6,calculator.add("1,2\n3"));
    }
    @Test 
	public void throwException(){

		calculator.add("1,2,-3,4,-5");
	}
	/*@Test
    public final void IfNegativeNumbers() {

         
         Exception exception = null;
    try {
            calculator.add("1,2.-3,4,-5");
    } catch (Exception e) {

        exception = e;
    }*/
    @Test 
    public void numbersBiggerThanThousandIgnored(){

    	assertEquals(19,calculator.add("3,1000,1001,6,10"));

    }
    
   
 }




