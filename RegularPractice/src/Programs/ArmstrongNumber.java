package Programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong number is the number whose addition of power (no of digits treated as power) of digits is equal to that number
		//eg 1634 is armstrong number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem=0;
		int res=0;
		int digit=0;
		int num=n;
		while(num!=0)
		{
			num=num/10;
			digit++;
		}
		num=n;//assign original no in num variable and perform operation on num only not on n
		while(num!=0)
		{
			rem=num%10;
			res+=(Math.pow(rem, digit));//power function returns the value of first argument raised to the second argument
			//here rem means individual digit ane digit means count of the digits eg 1634 have 4 digit of digit count
			num=num/10;
		
		}
		System.out.println(res);
  if(n==res)
  {
	  System.out.println("Armstrong number");
  }
  else
  {
	  System.out.println("Not armstrong number");
  }
	}

}
