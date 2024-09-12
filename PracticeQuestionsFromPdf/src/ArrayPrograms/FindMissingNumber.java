package ArrayPrograms;

public class FindMissingNumber {
	public static int FindMissingNumber(int a[])
	{
		int N=a.length+1;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int total=N*(N+1)/2;
		return total-sum;
	}

	public static void main(String[] args) {
		int arr[]= {1,3,4,6,2,7};
		System.out.println(FindMissingNumber(arr));
	}

}
