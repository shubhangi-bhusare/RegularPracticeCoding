package Programs;

public class PrintPrimeNoTillN {

	public static void main(String[] args) {
		int n=50;
		for(int i=1;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(i);
			}
		}
		

	}

}
