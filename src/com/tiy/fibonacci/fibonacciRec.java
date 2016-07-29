package com.tiy.fibonacci;

import java.util.Scanner;

//recursion
public class fibonacciRec
{
	static int num;
	int sum;
	
	
    private static Scanner sc = new Scanner(System.in);
	
    public void printRec()
    {
    	boolean stopS = true;
    	
    	while(stopS)
    	{
    		System.out.println("What number up to the sequence would you like to see");
    		num = sc.nextInt();
    		System.out.println();
    		
    		System.out.println("This is the suqence up until # " + num);
    		for(int i = 1; i <= num; i++)
    		{
    			sum = sum + fibRec(i);
    			System.out.println(fibRec(i));
    			System.out.println();
    			
    			
    		}
    		
    		System.out.println("The sum of the numbers in the sequence is " + sum);
    		System.out.println();
    		
    		System.out.println("Would you like to see antoher(type y or yes)(type anything else to stop)");
    		String choice = sc.next();
    		
    		if(choice.toLowerCase().equals("y") || choice.toLowerCase().equals("yes"))
    		{
    			
        		
    		}
    		else
    		{
    			stopS = false;
    		}
    		
    	}
    	
    }
	public static int fibRec(int num)
	{
		
		
		if(num == 1 || num == 2)
		{
			
			return 1;
		}
		
		return fibRec(num-1) + fibRec(num -2);
	}
	
	public static void main(String[] args)
	{
		fibonacciRec fr = new fibonacciRec();
		fr.printRec();
		
	}
}

