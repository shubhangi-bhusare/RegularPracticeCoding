package ArrayPrograms2;

public class SubArrayOfAddition0 {

	public static void main(String[] args) {
		int arr[]={1,0,-1,2,0,-2,3,4};		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					}
					
				}
			}
		}
	}
}
