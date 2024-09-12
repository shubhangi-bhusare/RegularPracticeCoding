package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr)
	{
		int [][] matrix=arr.stream().map(e->e.stream().mapToInt(Integer::intValue).toArray())
				.toArray(int[][]::new);
		int d1=0;
		int d2=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==j)
				{
					d1+=matrix[i][j];
				}else if(i==matrix.length-j-1)
				{
					d2+=matrix[i][j];
				}
			}
		}
		return Math.abs(d2-d1);
		
		
	}
	public static void main(String[] args) {
		List<Integer> arr1= Arrays.asList(1,2,4,5);
		List<Integer> arr2=Arrays.asList(6,9,8,9);
		List<List<Integer>> arrRes2=new ArrayList<List<Integer>>();
		arrRes2.add(arr1);
		arrRes2.add(arr2);
		System.out.println(diagonalDifference(arrRes2));
	}

}
