package ArrayPrograms;

public class CountNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6634;
		int count=0;
		if(n==0)
		{
			System.out.println("1");
		}else if(n<0)
		{
			n=n*-1;
		}
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Count of no is: "+count);

	}

}
