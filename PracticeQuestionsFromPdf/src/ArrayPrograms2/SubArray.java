package ArrayPrograms2;

public class SubArray {

	public static void subarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i]+","+a[j]);
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,1,4,1};
		subarray(arr);

	}

}
