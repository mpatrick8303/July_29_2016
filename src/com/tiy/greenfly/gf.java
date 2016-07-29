package com.tiy.greenfly;

public class gf
{
	

		  public static void main(String[] args) {

		    for (int i = 0;i<=30;i++){

		        System.out.println(("The number of greenfly on day " + (i) + " is   " + total(i)  ));
		    }

		  }

		  private static int total(int i) {
		    int sumnext = 0;
		    int weeknumber;
		    weeknumber =  (i-1)/7;
		    if (weeknumber == 0){
		      sumnext = parent(i) + child(i);
		    }
		    else {
		      sumnext = (total(i-7))*8 + total(i-1);

		      //System.out.println("ababa" + child(9) + "pppp" + child(8) + "kkkk" + parent(8));
		    }

		    return sumnext;
		  }

		  private static int child(int i) {
		    int c = 0;
		    int weeknumber;
		    weeknumber =  (i-1)/7;

		    if (weeknumber == 0){
		      c = parent(i)*8*i;
		    }
		    else {
		      c = parent(i)*8;
		    }

		    return c;
		  }

		  private static int parent(int i) {
		    int p = 1;
		    int weeknumber;
		    weeknumber =  (i-1)/7;

		    if (weeknumber == 0)
		      p= 1;
		    else 
		      p = (int) (1 + Math.pow(8, weeknumber)*(i-7));

		    return  p;
		  }
		
}
