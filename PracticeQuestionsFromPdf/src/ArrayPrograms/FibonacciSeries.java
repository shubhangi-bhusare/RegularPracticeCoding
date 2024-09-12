package ArrayPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int c=0;
		for(int i=0;i<8;i++)
		{
			System.out.print(first+" ");
			c=first+second;
			first=second;
			second=c;
		}

	}

}
