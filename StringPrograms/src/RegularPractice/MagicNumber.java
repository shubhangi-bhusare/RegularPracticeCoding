package RegularPractice;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
//		 2. Write a Java Program to check if any number is a magic number or not. A
//		 number is said to be a magic number if after doing sum of digits in each step and
//		 in turn doing sum of digits of that sum, the ultimate result (when there is only
//		 one digit left) is 1. ex= 163 => if sum is 10 => 1 so it is magic number.
		Scanner sc=new Scanner(System.in);
		int rem=0;
		int sum=0,num,n;
		
		System.out.println("Enter the number");
		 num=sc.nextInt();
		 n=num;
		while(n>9)
		{
			while(n>0)
			{
				rem=n%10;
				sum=sum+rem;
				n/=10;
			}
			n=sum;
			sum=0;
		}
		
		System.out.println(n);
		if(n==1)
		{
			System.out.println("It is Magic Number");
		}
		else {
			System.out.println("Not magic number");
		}
	}

}
