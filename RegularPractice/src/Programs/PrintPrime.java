package Programs;

public class PrintPrime {
	
	public static int printPrime(int num)
	{
		int cnt=1;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				cnt++;
			}
			
		}
		if(cnt==1)
		{
			return num;
		}else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		int longest=0;
		for(int i=1;i<=100;i++)
		{
			int result=printPrime(i);
			if(result>longest)
			{
				longest=result;
			}
		}
		System.out.println("Longest prime numebr is: "+longest);

	}

}
