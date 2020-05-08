package basicProgrammingQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElements 
{
	public static void main(String[] args) 
	{
	
		//1st Solution is comparing every element one by one  ---- Worst Solution
		String names[] = {"jaba", "abc", "nrc", "java", "abc", "jaba", "nrc"};
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				//System.out.println(names[i]+"="+names[j]);
				if(names[i].equalsIgnoreCase(names[j]))  // nrc=abc, nrc=abc, 
				{
					System.out.println("Duplicate found at "+j+" is "+names[i]);
				}
			}
		}
		
		System.out.println("--------------------------------------------------------");

		//2nd Solution is using HashSet because HashSet stores only Unique element. No Duplicates allowed.
		HashSet<String> hs = new HashSet<String>();
	
		for(int i=0; i<names.length; i++)
		{
			//System.out.print(names[i]);
			//System.out.println(hs.add(names[i]));
			if(hs.add(names[i])==false)
			{
				System.out.println("Duplicate element is :: "+names[i]);
			}
		}
		System.out.println("----------------------");
		System.out.println("After Removing Duplicate Elements from Array = "+hs);
		
		
		System.out.println("--------------------------------------------------------");
		
		
		//3rd Solution is using HashMap in which String as key because in HashMap duplicate keys are not allowed.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0; i<names.length; i++)
		{
			Integer status = hm.put(names[i], i);
			
			if(status!=null)
			{
				System.out.println(+status+") Duplicate Entry Found = "+names[i]);
			}
			
		}

		System.out.println("After Removing Duplicate Elements = "+hm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
