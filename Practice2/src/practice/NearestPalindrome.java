package practice;

public class NearestPalindrome {

	public static void main(String[] args) {
		int num1=123;
		int num2=133;
		System.out.println("Nearest Palindrome of num1 is: "+nearestPalindrome(num1));
		System.out.println("Nearest Palindrome of num2 is: "+nearestPalindrome(num2));
	}
	public static int nearestPalindrome(int n)
	{
		if(isPalindrome(n))
		{
			return n;
		}
		int lower=n-1;
		int higher=n+1;
		while(true)
		{
			if(isPalindrome(lower))
			{
				return lower;
			}
			if(isPalindrome(higher))
			{
				return higher;
			}
			lower--;
			higher++;
		}
	}
	public static boolean isPalindrome(int n)
	{
		int rem=0;
		int rev=0;
		int a=n;
		while(a!=0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(rev==n)
		{
			return true;
		}
		return false;
			
	}

}
