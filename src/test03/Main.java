package test03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("C:\\b.dat");
		out.write(100);
		out.flush();
		out.close();
		
		InputStream in = new FileInputStream("C:\\b.dat");
		int a = in.read();
		System.out.println(a);
		in.close();
		
	}
}
