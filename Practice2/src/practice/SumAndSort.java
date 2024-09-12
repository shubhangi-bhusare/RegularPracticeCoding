package practice;
//Array sort by sum
//[23,45,56,90] 
//Sum of each element is 5,9,11,9
//Output should be sorted in accordance to the sum, if it's equal then sort according to number itself
//Output :[ 23,45,90,56]
public class SumAndSort {
	public static int digitSum(int a)
	{
		int sum=0;
		int rem=0;
		//int N=a;
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a/=10;
			
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[]= {23,45,56,90};
		
		int arr2[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=digitSum(arr[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("after sorting");
		//Sorting logic
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr2[i]<arr2[j])
				{
					int temp1=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp1;
					
					int temp2=arr[i];
					arr[i]=arr[j];
					arr[j]=temp2;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		int arr3[]= {9,2,3,5,11};
		for(int i=0;i<arr3.length;i++)
		{
			for(int j=i+1;j<arr3.length;j++)
			{
				if(arr3[i]<arr3[j])
				{
					int temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
