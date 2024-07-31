package ArrayPrograms;

public class CopyElementsOfOneArrayToOther {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 4, 8, 6, 9, 2 };
		int arr2[] = new int[arr1.length];

		// copy arr1 elements into arr2
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		// display arr1 elements
//		System.out.print("Array1 elements are:");
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		// Display elements in array2
//		System.out.print("Array2 elements are:");
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
		int arr3[]= {12,32,3,98,11};
		int arr4[]=new int[arr3.length];
		for(int i=0;i<arr3.length;i++)
		{
			arr4[i]=arr3[i];
		}
		System.out.println("arr4 elements are");
		for(int i=0;i<arr4.length;i++)
		{
			System.out.println(arr4[i]);
		}
	}

}
