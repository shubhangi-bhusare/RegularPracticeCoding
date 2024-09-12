package ArrayPrograms2;

public class Try {
	public static int tryProgram(int n,int m)
	{
		int cnt=0;
		for(int i=n;i<= m;i++)
		{
			for(int j=n;j<m;j++)
			{
				if(i+1==m || j+1==m)
				{
					cnt++;
					System.out.println(i+","+j);//output should be 2,2;  3,2;  3,4;  4,4
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int n=2;
		int m=4;
		System.out.println(tryProgram(n,m));
	}

}
