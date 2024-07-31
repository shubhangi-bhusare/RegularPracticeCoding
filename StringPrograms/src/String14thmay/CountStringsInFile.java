package String14thmay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountStringsInFile {

	public static void main(String[] args) throws IOException {
//		String line;
//		int count=0;
//		BufferedReader br=new BufferedReader(new FileReader("abc1.txt"));
//		while((line=br.readLine())!=null)
//		{
//			String words[]=line.split(" ");
//			count=count+words.length;
//			
//		}
//		System.out.println("count of words in the file is : "+count);
//		br.close();
//			
		//only read the content in file
		try(BufferedReader br=new BufferedReader(new FileReader("abc1.txt")))
		{
			br.lines()
			.forEach(i->System.out.println(i));
		}
		

	}

}
