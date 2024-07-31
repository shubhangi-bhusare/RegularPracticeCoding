package ArrayPrograms;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {85,9,28,54,63,88,75,12};
		System.out.println("Original array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array in reverse order is:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
