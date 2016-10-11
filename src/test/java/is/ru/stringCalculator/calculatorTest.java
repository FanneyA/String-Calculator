package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0,Calculator.add(""));
	}

}