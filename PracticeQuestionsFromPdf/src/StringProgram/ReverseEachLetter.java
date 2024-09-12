package StringProgram;

public class ReverseEachLetter {

	public static void main(String[] args) {
		String s="Shubhangi mahesh navle";
		String [] str=s.trim().split(" ");
		String ss[]=s.trim().split("");
		String w="";
		String v="";
		for(int i=str.length-1;i>=0;i--)
		{
			w+=str[i]+" ";
		}
		System.out.println("Reverse string is:"+w);
		
		System.out.println("------------------------------------------------");
		for(int i=ss.length-1;i>=0;i--)
		{
			v+=ss[i];
		}
		System.out.println("Reverse string is:"+v);


	}

}
