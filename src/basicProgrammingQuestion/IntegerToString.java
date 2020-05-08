package basicProgrammingQuestion;

public class IntegerToString 
{
	
	
	public static void main(String[] args) 
	{
		int number = 12345;
		String strInt = String.valueOf(number);  // it will convert the int into String
		System.out.println(strInt);
		
		
		
		StringBuffer sb = new StringBuffer(strInt);  // pass the String into StringBuffer class
		StringBuffer reverseString =	sb.reverse();   // Because StringBuffer is mutable class you can use it's method reverse
		System.out.println("Reverse Integer = "+reverseString);
		
		
	
		
	}
	

}
