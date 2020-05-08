package basicProgrammingQuestion;

public class SubString 
{

	public static void main(String[] args) {

		
	//	String s1 = "tel:02077683102";
		
		String s1 = "Tushar Singh Rajput";
		
		//String s2 = 	s1.substring(7, 19);
		
		int arrayLength = s1.length();
		System.out.println("Array length = "+arrayLength);
		
		
		for (int i = 0; i < arrayLength; i++)
		{
			char temp = s1.charAt(i);
			System.out.println("Char at index "+i+" is -> "+temp);
		}
		
		
		//System.out.println(s2);
		
//		int a = 10;
//		int b = 10;
//		
//	
//		String original = "207768310";
//		
//		System.out.println(original.equals(s2));
//		System.out.println(original==s2);
//		
//		System.out.println(a==b);
		

		
	}
	
}
