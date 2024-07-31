package String14thmay;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countCharOccurances {

	public static void main(String[] args) {
		String str="shubhangimanikbhusare";
		Map<String, Long> map=new TreeMap<>(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(map);//give sorted output
	
//		String str = "picture perfect";    
//        int[] freq = new int[str.length()];    
//        int i, j;    
//            
//        //Converts given string into character array    
//        char string[] = str.toCharArray();    
//            
//        for(i = 0; i <str.length(); i++) {    
//            freq[i] = 1;    
//            for(j = i+1; j <str.length(); j++) {    
//                if(string[i] == string[j]) {    
//                    freq[i]++;    
//                        
//                    //Set string[j] to 0 to avoid printing visited character    
//                    string[j] = '0';    
//                }    
//            }    
//        }    
//            
//        //Displays the each character and their corresponding frequency    
//        System.out.println("Characters and their corresponding frequencies");    
//        for(i = 0; i <freq.length; i++) {    
//            if(string[i] != ' ' && string[i] != '0')    
//                System.out.println(string[i] + "-" + freq[i]);    
//        }    
//    }    
//}    
	}	

}
