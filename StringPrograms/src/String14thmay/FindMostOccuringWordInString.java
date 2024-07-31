package String14thmay;

public class FindMostOccuringWordInString {

	public static void main(String[] args) {
		String str="everyday day by day i am getting better better and better";
		String arr[]=str.split(" ");
		int count;
		int freq=0;
		String res="";
		for(int i=0;i<arr.length;i++)
		{ 
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					//arr[j]="0";
				}
			}
			if(count>freq)
			{
				res=arr[i];
				freq=count;
			}
		}
		System.out.println("The most occuring string is: "+res);
		System.out.println("count is"+freq);

	}

}
