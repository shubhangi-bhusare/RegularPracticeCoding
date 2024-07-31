package String14thmay;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteContentInFile {

	public static void main(String[] args) throws IOException {
		String text="hello, shubhangi here...welcome to java programming!!";
		System.out.println("writing in the file");
		PrintWriter pw=new PrintWriter("abc1.txt");
		pw.println(text);
		pw.close();

	}

}
