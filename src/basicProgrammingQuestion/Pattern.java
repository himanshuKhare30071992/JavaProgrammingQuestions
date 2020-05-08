package basicProgrammingQuestion;


/**
 * @author SonyVaio-HK
 *		OUTPUT: 	1234567	
 *						123456
 *						12345
 *						1234
 *						123
 *						12		
 *						1
 *
 */

public class Pattern 
{
	public static void main(String[] args) 
	{
		for(int i=7; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
	}

}
