package basicProgrammingQuestion;

public class LargestNumberInArray 
{

	
	
		public static void main(String[] args) 
		{
		
			 int arr[] = {12, 22, 33, 5};
			 int largest = arr[0];  // largest = 12 
			 
			 System.out.println(largest);
			 
			int arrayLength = arr.length;
			System.out.println("Array Size  = "+arrayLength);
			
			System.out.println("-------------------------------------------------");
			
			for (int i = 0; i < arrayLength; i++) 
			{
					System.out.println("Array Data at index "+i+" is "+arr[i]);
			}
			
			System.out.println("-------------------------------------------------");
			
			for (int i = 0; i < arrayLength; i++) 
			{
					if(arr[i]>largest) // 12>12; 222>12; 3333>222; 4>
					{
						 largest = arr[i]; // 12 // 222 // 3333
					}
					
			}
			
			System.out.println("Largest = "+largest);
			
			
			
			
			
		}
}
