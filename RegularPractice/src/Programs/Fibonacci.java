package Programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1,c=0;
		for(int i=0;i<=n;i++)
		{
			System.out.print(a+" ");
			 c=a+b;
			a=b;
			b=c;
		}
	}

}
