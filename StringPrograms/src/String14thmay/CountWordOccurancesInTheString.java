package String14thmay;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurancesInTheString {

	public static void main(String[] args) {
		String str="Big black bug bit a big black dog on his big black nose";
		String[] str1=str.split(" ");
		//String [] str1= {"Big","black","bug","bit"," a","big","black","dog" ,"on" ,"his","big","black","nose"};
		Map<String,Long> map=Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

	}

}
