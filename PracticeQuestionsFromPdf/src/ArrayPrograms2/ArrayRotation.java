package ArrayPrograms2;

public class ArrayRotation {

	public static void main(String[] args) {
//		Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.
//				 => Store the elements from 2nd index to the last.
//				output should be: 3, 4, 5, 6, 7, 1, 2	
		int arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2;
		ArrayRotation(arr,d);
	}
	public static void ArrayRotation(int []arr, int d)
	{
		int k=0;
		int newArr[]=new int[arr.length];
		d=d%arr.length;
		for(int i=d;i<arr.length;i++)
		{
			newArr[k++]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			newArr[k++]=arr[i];
		}
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}

}
