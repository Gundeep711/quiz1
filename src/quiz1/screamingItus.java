package quiz1;

import java.util.Scanner;

public class screamingItus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of weeks you want to calculate the infection Rate for :");
		int week=sc.nextInt();
		int numberOfdays=week*7;
		int numberInfected=1;
		int totalInfected = 0;
		for(int i=1;i<=numberOfdays;i++)
		{
			
			if(i>=1&&i<=8)
			{
				if(i/2==0)
				{
					numberInfected=numberInfected+0;
					totalInfected=numberInfected;
				}
				else
				{
					numberInfected=numberInfected+5;
					totalInfected=numberInfected;	
				}
			
			}
			
			if(i>=9)
			{
				if(i/2==0)
				{

					numberInfected=numberInfected+0;
					totalInfected=numberInfected;
				}
				
				else
					{
					numberInfected=numberInfected+8;
					totalInfected=numberInfected;
					}
				
			}
			
		}

		System.out.println("Total number of Infected Instructors are : "+totalInfected);
		
		
	}

}
