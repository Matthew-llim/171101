package test08;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String ln = sc.nextLine();
		char[] ch = ln.toCharArray();
		
		Writer out = new FileWriter("C:\\b.txt");
		
		for(int i =0;i<ch.length;i++){
			out.write(ch[i]);
		}
		out.close();
		
	}
}
