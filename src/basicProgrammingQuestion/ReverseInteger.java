package basicProgrammingQuestion;

public class ReverseInteger 
{
	
	public static void main(String[] args) 
	{
		int number = 12344325;
		int reverse=0;
		int count=0;
		
		while (number!=0)
		{
			reverse =number%10;  // 5
			System.out.print(reverse);
			number = number/10; // 1234, 123, 12, 1		
			count++;
		}
		System.out.println();
		System.out.println("Length of Integer = "+count);

	
	// 2nd Way :- Using StringBuffer
	
		int num = 123456;
		StringBuffer sb = new StringBuffer();
		
	
	
	
	
	
	}



}