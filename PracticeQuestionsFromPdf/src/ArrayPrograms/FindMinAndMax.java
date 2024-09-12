package ArrayPrograms;

public class FindMinAndMax {
	public static int Min(int [] a)
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	public static int Max(int []b)
	{
		int max=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[]= {32,4,35,96,6,9,3,1,45,77};
		System.out.println(Min(arr));
		System.out.println(Max(arr));

	}

}
