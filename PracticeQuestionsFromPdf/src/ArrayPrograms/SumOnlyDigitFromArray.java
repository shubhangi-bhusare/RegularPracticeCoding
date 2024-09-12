package ArrayPrograms;

public class SumOnlyDigitFromArray {

	public static void main(String[] args) {
		String[] array = {"5", "2", "96", "a", "1", "6", "#", "3"};
		int sum=SumInteger(array);
		System.out.println("sum is: "+sum);
	}
	public static int SumInteger(String arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i].charAt(0)))
			{
				sum+=Integer.parseInt(arr[i]);
			}
		}
		return sum;
	}

}
