package Programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
