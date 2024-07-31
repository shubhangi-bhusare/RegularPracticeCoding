package ArrayPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEachElementInArray {

	public static void main(String[] args) {

//		System.out.println("------------------------------------");
//		Map<Integer,Long> map=Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
//		int[] intArray = {1, 2, 3, 4, 5};
//		Integer[] integerArray = Arrays.stream(intArray)
//                .boxed()
//                .toArray(Integer[]::new);
//		
		Integer arr1[]=new Integer[] {54,8,789,556,22,3,5,36,87,956,62,789,789,956,8,8,5};
//		Map<Integer,Long> map1=Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(map1);
		
			
		Map<Integer, Long> map=Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}

}
