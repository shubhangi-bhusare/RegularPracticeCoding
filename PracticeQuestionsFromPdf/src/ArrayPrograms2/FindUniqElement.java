package ArrayPrograms2;

public class FindUniqElement {

	public static void FindUniq(String s)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int cnt=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
					cnt++;
				}
			}
			if(cnt==0)
			{
				System.out.println(ch[i]);
				break;//firstuniqelement
				//return i;
			}
			
		}
		//return -1;
	}
	public static void main(String[] args) {
		String str="leetcode";
		//System.out.println(FindUniq(str));
		FindUniq(str);//give 1st uniq element

	}

}
