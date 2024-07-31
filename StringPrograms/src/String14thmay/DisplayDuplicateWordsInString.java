package String14thmay;

public class DisplayDuplicateWordsInString {

	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		str=str.toLowerCase();
		String word[]=str.split(" ");
		int count;
		for(int i=0;i<word.length;i++)
		{
			count=1;
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
					word[j]="0";//set zero here becoz it cant visit that word again 
				}
			}
			if(count>1&&word[i]!="0")//here both conditions are mandatory becoz above we set repeated word value as zero so they cant print again when they come
				System.out.println(word[i]);
			//System.out.println(count);
		}
		
		

	}

}
