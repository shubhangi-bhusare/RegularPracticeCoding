package Sortings;

public class BubbleSort {

	public static void bubbleSort(int arr[])
	{
		int pass=arr.length-1;
		int comp=arr.length-1;
		for(int i=0;i<pass;i++)
		{
			for (int j=0;j<(comp-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
				    int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			 
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,34,5,12,43,66};
		bubbleSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
