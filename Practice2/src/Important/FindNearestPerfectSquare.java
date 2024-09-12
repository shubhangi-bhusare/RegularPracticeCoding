package Important;

public class FindNearestPerfectSquare {

	public static int NearestPerfectSquare(int n)
	{
		int sqrt=(int)Math.floor(Math.sqrt(n));
		return sqrt*sqrt;
	}
	public static int NearestPerfectSquare2(int n)
	{
		int k=1;
		int perfectSqure=1;
		while(k*k<=n)
		{
			perfectSqure=k*k;
		   k++;
		}
		return perfectSqure;
	}
	public static void main(String[] args) {
		int num=25;
		System.out.println(NearestPerfectSquare(num));
		System.out.println(NearestPerfectSquare2(num));

	}

}
