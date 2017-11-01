package test04;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Writer out = new FileWriter("C:\\out.txt");
		
		String ln = sc.nextLine();
		char[] cs = ln.toCharArray();
		
		for(int i =0;i<cs.length;i++){
			out.write(cs[i]);
		}
		
		out.flush();
		out.close();
	}
}
