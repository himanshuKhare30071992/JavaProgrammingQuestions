package basicProgrammingQuestion;



/**
 * @author HK-SONY
 * 			Q: WAP to generate below pattern
 *  		*
 *  		**
 *  		***
 *  		****
 *  		*****	
 */
public class StarRightAngle
{
	
		public void starPattern(int levelNo)
		{
			int level = levelNo;
			for(int i=1; i<=level; i++ ) // 1 //2
			{
				for (int j =1; j <= i; j++)  
				{
					System.out.print("* ");  //1
				}
				System.out.println();
			}
		}

		public static void main(String[] args)
		{
				StarRightAngle str = new StarRightAngle();
				str.starPattern(5);
		}
}
