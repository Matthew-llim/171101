package test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("c:\\gcc.exe");
		
		int r =in.read();
		in.close();
		
		OutputStream out = new FileOutputStream("C:\\a.exe");
		out.write(r);
		
		out.flush();
		out.close();
		
		
	}
}
