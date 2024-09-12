package ArrayPrograms2;

public class Count1InArray {

	public static void countMaxOccurance(int arr[])
	{
		int count=0;
		int maxCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				count++;
				maxCount=Math.max(maxCount, count);
			}else {
				count=0;
			}
		}
		System.out.println(maxCount);
	}
	public static void main(String[] args) {
		int a[]= {1,1,0,1,1,1,0,1,1,1,1};
		countMaxOccurance(a);

	}

}
