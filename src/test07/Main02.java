package test07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main02 {
	public static void main(String[] args) throws Exception{
		
		InputStream in = new FileInputStream("C:\\gcc.exe");
		OutputStream out = new FileOutputStream("C:\\a.exe");
		
		int r = 0;
		
		while((r=in.read())!=-1){
			out.write(r);
		}
		
		in.close();
		out.close();
		
		
		
	}
}
