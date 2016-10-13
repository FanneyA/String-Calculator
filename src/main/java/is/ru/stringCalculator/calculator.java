package is.ru.stringCalculator;


import java.util.ArrayList;

public class calculator {

	public static int add(String text){

		if(text.equals(""))
			
			return 0;

		else if(text.contains(",")) 
		{

			return sum(splitNumbers(text));

		}
		else if(text.contains("\n")) 
		{

			return sum(splitNumbers(text));
		}
		else

			return 1;
	}
	private static int toInt(String number){

		return Integer.parseInt(number);
	}
	private static String[] splitNumbers(String numbers){

		return numbers.split("[,:\n]");

	}
	private static int sum(String[] numbers){
		
		int total=0;

		ArrayList<Integer> ifNegative = new ArrayList<Integer>();
		
	for(String number : numbers){

		
		if(Integer.parseInt(number) >=0 && Integer.parseInt(number) <1000)
		{

			total += Integer.parseInt(number);

		}
		if(Integer.parseInt(number) < 0)
		{

			ifNegative.add(Integer.parseInt(number));
		}
		
         
		}
		if(ifNegative.size()>0)
		{
			throw new RuntimeException("Negatives not allowed: " + ifNegative.toString());
		}
		
		return total;

	}

}
