package basicProgrammingQuestion;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str = "abc him";
		int stringLength = str.length();
		//System.out.println(stringLength);
		
		for(int i=stringLength-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
				
	}

}
