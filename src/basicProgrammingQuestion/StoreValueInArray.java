package basicProgrammingQuestion;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreValueInArray {

	static int[] a;
	static int temp;
	
	
	public static void main(String[] args)
	{
		WebDriver driver  = new ChromeDriver();
		driver.get("file:///C:/Users/HK-SONY/Desktop/sorting.html");
		
		List<WebElement> optionCount = driver.findElements(By.xpath("//select[@id='id']//option"));
		//System.out.println(optionCount.size());

		a = new int[optionCount.size()]; 
		
		for(int i=0; i<optionCount.size(); i++)
		{
			String str = optionCount.get(i).getText();
			int intValue =  Integer.parseInt(str);
		 	a[i] = intValue;	
		}
		
		System.out.println("Original Integer Array ="+Arrays.toString(a));
		
		//Arrays.sort(arr);
		//System.out.println("Integer Array in Ascending Order  ="+Arrays.toString(arr));
		
		
		for(int i=0; i<optionCount.size(); i++)
		{
			for(int j= i+1; j<optionCount.size(); j++)
			{
//				System.out.println("a[i] = "+a[i]);
//				System.out.println("a[j] = "+a[j]);
//				System.out.println("temp = "+temp);
				
				if (a[j]<a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
					System.out.println("--------------------------------------");
					
//					System.out.println("a[i] = "+a[i]);
//					System.out.println("a[j] = "+a[j]);
//					System.out.println("temp = "+temp);
			}
			
		}
		
		System.out.println("Descending Integer Array ="+Arrays.toString(a));
		
		
				
		
		
		
		
		driver.close();
		
		
	
	}
	
}
