package ArrayPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int t=34643;
		int n=t;
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Reverse number is: "+rev);	
		if(t==rev)
		{
			System.out.println("Number is palindrome !!");
		}else {
			System.out.println("Number is not palindrome!!");
		}
	}

}
