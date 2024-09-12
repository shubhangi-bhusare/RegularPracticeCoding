package ArrayPrograms;

public class SelectionSort {
	public static void SelectionSort(int n[])
	{
		for(int i=0;i<n.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n.length;j++)
			{
				if(n[j]<n[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=n[i];
			n[i]=n[minIndex];
			n[minIndex]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,2,9,1,6};
		SelectionSort(arr);
		
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		

	}

}
