package ArrayPrograms;

public class CountOddEvenOccurance {

	public static int[] CountEvenOdd(int [] arr)
	{
		int res[]=new int[2];
		int cnt=1;
		int oddcnt=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				res[0]=cnt++;
			}else {
				res[1]=oddcnt++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int b[]= {2,3,4,6,1,8,80,77,99};
		int [] a=CountEvenOdd(b);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}

}
