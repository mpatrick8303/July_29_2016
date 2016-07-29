package ifElse;

import java.util.Scanner;

public class ifElse
{
//	Task 
//	Given an integer, , perform the following conditional actions:
//
//	If  is odd, print Weird
//	If  is even and in the inclusive range of 2 to 5, print Not Weird
//	If  is even and in the inclusive range of 6 to 20, print Weird
//	If  is even and greater than 20, print Not Weird
//	Complete the stub code provided in your editor to print whether or not  is weird.
//
//	Input Format
//
//	A single line containing a positive integer, .
//
//	Constraints
//
//	Output Format
//
//	Print Weird if the number is weird; otherwise, print Not Weird.
	private Scanner sc = new Scanner(System.in);
	
	public void condition()
	{
		String output = null;
		
		
		boolean stop = true;
		
		while(stop)
		{
			System.out.println("Please enter a number: ");
			int scan = sc.nextInt();
			
			if((scan % 2) == 1 && scan <= 100)
			{
				output = "Weird";
			
			}
			else
			{
		
				if(scan >= 2 && scan <= 5)
				{
					output = "Not Weird";
				
				}
				else if (scan >= 6 && scan <= 20)
				{
					output = "Weird";
				
				}
				else if(scan > 20 && scan <= 100)
				{
					output = "Not Weird";
				
				}
				else if(scan > 100)
				{
					System.out.println("That is to high of a number, please try again");
					System.out.println();
					condition();
				
				
				}
			
			}
			System.out.println(output);
			
			System.out.println();
			System.out.println("Do you want to try again(type y or yes)(type anythign else to quit)");
			String stopScan = sc.next();
			
			
			if(stopScan.toLowerCase().equals("y") || stopScan.toLowerCase().equals("yes"))
			{
				stop = true;
			}
			else
			{
				stop = false;
			}


		}
		
		
	}
	
	public static void main(String[] args)
	{
		ifElse ie = new ifElse();
		ie.condition();
		
	}
	
	
}
