package test08;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main02 {
	
	private static void writeLine(Writer w, String l) throws Exception{
		char[] ch = l.toCharArray();
		for(int i=0;i<ch.length;i++){
			w.write(ch[i]);
		}
		w.write('\r');
		w.write('\n');
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		Writer out = new FileWriter("C:\\b.txt");
		while(true){
			String l =sc.nextLine();
			if(l.equals("Quit")){
				break;
			}
			writeLine(out,l);
		}
		
		
		out.close();
	}
}
