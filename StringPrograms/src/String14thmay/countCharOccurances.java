package String14thmay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countCharOccurances {

	public static void main(String[] args) {
		String str="shubhangimanikbhusare";
		Map<String, Long> map=new TreeMap<>(Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(map);//give sorted output
		Map<String,Long> m=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		List<String> list=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(i->i.getValue()>1l)
				.map(i->i.getKey())
				.collect(Collectors.toList());
				
				System.out.println(list);
				
		System.out.println(m);
   
	}	

}
