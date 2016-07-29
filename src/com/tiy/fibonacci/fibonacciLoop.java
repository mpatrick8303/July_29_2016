package com.tiy.fibonacci;

import java.util.ArrayList;

public class fibonacciLoop
{
//	Find the first term greater than 1000 in the sequence:
//		1 1 2 3 5 8 13 . . .
//		Also find the sum of all the values up to that term.
	private ArrayList<Integer> nums = new ArrayList<Integer>();
	int i1 = 1;
	int i2 = 1;
	int i3 = 1;
	int sum;
	
	
	public void sequence()
	{
		System.out.println(i1);

		System.out.println(i1);
		
		while(!(i3>1000))
		{
			i3 = i1 + i2;
			i1 = i2;
			i2 = i3;
			
			
			System.out.println(i3);
			
			sum = sum + i3;
			
		}
		System.out.println();
		System.out.println("The sum of all the number's is " + sum);
	}
	
	public static void main(String[] args)
	{
		fibonacciLoop f = new fibonacciLoop();
		f.sequence();
	}

}
