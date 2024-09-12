package ArrayPrograms2;

public class ArrayProductOfTargetedElementSum {
	public static void ProductivePairs(int N,int A[], int K)
	{
		int value=0;
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]*A[j]>=K)
				{
					sum+=A[i]*A[j];
					++value;
				}
			}
		}
		System.out.println(value+","+sum);
	}
	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		ProductivePairs(5, arr, 6);

	}

}
