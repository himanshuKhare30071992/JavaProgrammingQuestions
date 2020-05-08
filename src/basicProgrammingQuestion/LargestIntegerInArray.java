package basicProgrammingQuestion;


public class LargestIntegerInArray 
{
	public static void main(String[] args) {
		
		int arr[] = {11, 23, 5, 17, 9};
		
		int largest = arr[0]; 
		//int temp[] = null;
				
		//System.out.println(arr.length);
		
		
		for(int i=1; i<arr.length; i++)
		{
			if (arr[i] > largest)   
			{
				largest = arr[i];  		
			}
		}
		
		System.out.println("Largest number in given array = "+largest);
		
		
	}
	
}
