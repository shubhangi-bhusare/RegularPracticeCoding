package NumberProgram;

public class CheckPerfectSquare {

	public static boolean checkSquare(int n)
	{
		int i=0;
		int j=n;
		while(i<=j)
		{
			int mid=i+(j-i)/2;
			long pow=(long)mid*mid;
			if(pow==n)
			{
				return true;
			}else if(pow>n)
			{
				j=mid-1;
			}else {
				i=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n=16;
		System.out.println(checkSquare(n));

	}

}
