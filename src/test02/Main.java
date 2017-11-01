package test02;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
	public static void main(String[] args) throws Exception{
		InputStream in = new FileInputStream("C:\\out.dat");
		int a = in.read();
		int b = in.read();
		int c = in.read();
		int d = in.read();
		int e = in.read();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
