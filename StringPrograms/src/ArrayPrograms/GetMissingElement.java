package ArrayPrograms;

public class GetMissingElement {
	public static int getMissingElement(int arr[],int n)
	{
		int sum=0;
		int N=n+1;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		return (N*(N+1)/2)-sum;
		
	}
	
	public static void main(String[] args) {
		//first declare the function to  getmissing element
		int arr[]= {1,4,3,5,6,9,7,2};
		int n=arr.length;
		int result=getMissingElement(arr,n);
		System.out.println(result);

	}

}
