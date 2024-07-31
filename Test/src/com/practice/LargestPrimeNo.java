package com.practice;

public class LargestPrimeNo {

	public static void main(String[] args) {
		int largest=0;
		for(int i=2;i<=100;i++)
		{
			int result=printPrime(i);
			if(result>largest)
			{
				largest=result;
			}
		}
		System.out.println(largest);

	}
	public static int printPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n/2; i++) {

			if (n % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0)
			return n;
		else
			return 0;
	}

}
