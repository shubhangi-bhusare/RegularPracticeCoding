package Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter number");
//    	int n=sc.nextInt();
    	int n1=5;
//    	int factorial=fact(n);
//    	System.out.println(factorial);
//    	
//	}
//	public static int fact(int n)
//	{
//		if((n==0)||(n==1))
//    	{
//    		return 1;
//    	}
//		else
//			return n*fact(n-1);
//
//	}
    	int fact=1;
    	for(int i=1;i<=n1;i++)
    	{
    		 fact=fact*i;
    	}
    	System.out.println(fact);
	}
}
