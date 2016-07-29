package com.tiy.greenfly;

public class greenFly
{
//	Greenfly can reproduce asexually. After one week of life a lone female can produce eight
//	offspring a day. Starting at the beginning of day 1 with a single mature female, how many
//	greenfly could there be by the end of day 28? It may be assumed that:
//	• There are no deaths
//	• All offspring are females
//	Note that at the end of day 1 there will be 9 greenfly (original + 8 offspring). At the end
//	of day 7 there will be 57 greenfly (original + 8 × 7 offspring). At the end of day 8 there
//	will be 129 greenfly (original + 8 × 8 offspring + 64 offspring from the daughters produced
//	on day 1).

	
	private int numG;
	private int oS;
	
	public int getGreenfly(int days)
	{
		for(int i = 1; i<=days; i++)
		{
			if(days<=7)
			{
				numG = 1 + (8*days);
			}
			else
			{
				oS++;
				numG = 1 + (8 * days) + oS*8;
			}
		}
		
				
		
		return numG;
	}
	
	
	
	public static void main(String[] args)
	{
		greenFly gf = new greenFly();
		System.out.println(gf.getGreenfly(28));
	}
	
}


