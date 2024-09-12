package ArrayPrograms;

public class FindMaxProductOfTwoIntegerInArray {

	public static int FindMaxProd(int arr[])
	{
		if(arr.length<2)
		{
			return -1;
		}
		int maxProd=arr[0]*arr[1];
		for(int i=1;i<arr.length-1;i++)
		{
			int product=arr[i]*arr[i+1];
			if(maxProd< product)
			{
				maxProd=product;
			}
		}
		return maxProd;
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,2,9,8};
		System.out.println(FindMaxProd(arr));

	}

}
