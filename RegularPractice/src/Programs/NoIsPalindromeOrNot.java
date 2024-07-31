package Programs;

import java.util.Scanner;

public class NoIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int rem=0;
		int num=n;
		while(n!=0)
		{ 
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of the number is:"+rev);
		if(num==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}

	}

}
