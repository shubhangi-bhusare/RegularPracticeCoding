package ArrayPrograms;
import java.util.Arrays;

public class StringIsValidNotValidLogic {

	public static void main(String[] args) {
		String str1 = "maheshnavale";
		String str2 = "navalemahesh";
		String str3 = "leavanhseham"; 
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		char ch3[]=str3.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		Arrays.sort(ch3);
		
		if(ch1.length==ch2.length||ch2.length==ch3.length||ch1.length==ch3.length)
		{
			int j=0;int k=0;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[j]||ch2[j]==ch2[k]||ch3[i]==ch3[k])
				{
					j++;
					k++;
				}
				System.out.println("valid String");
			}
			
		}
		else
		{
			System.out.println("Invalid String");
		}

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		char arr[] =str1.toCharArray();
//		char arr1[]=str2.toCharArray();
//		char arr2[]=str3.toCharArray();
//
//		Arrays.sort(arr);
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//
//		if(arr.length == arr1.length || arr1.length == arr2.length){
//			int j=0,k=0;
//		    for(int i=0;i<arr.length;i++){
//
//		        if(arr[i] == arr1[j] || arr1[j] == arr2[k] ||arr[i] == arr2[k]){
//		            j++;
//			    k++;
//			    System.out.println("Valid");
//			}else{
//		          System.out.println(" string is invalid");
//
//		      }
//		}


//		}



	
