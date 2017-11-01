package test04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Main02 {
	public static void main(String[] args) throws Exception{
		Writer out = new FileWriter("C:\\out.txt");
		
		int r = '한';
		out.write(r);
		
		out.flush();
		out.close();
		
		Reader in = new FileReader("C:\\out.txt");
		int ch = in.read();
		in.close();
		System.out.println((char)ch);
	}
}
/*
 * java의 char는 2바이트 크기라서 Writer의 write는 한번에 2바이트를 전송
 * -Writer의 write를 이용하여 내보낸 문자 정보는 안깨진다. 	
*/