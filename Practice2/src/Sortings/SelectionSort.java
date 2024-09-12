package Sortings;

public class SelectionSort {

	public static void SelectionSort(int arr[])
	{
		int min=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,34,5,12,43,66};
		SelectionSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
