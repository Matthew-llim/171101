package test01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("C:\\out.dat");
		
		out.flush();
		out.close();
		
		
	}
}
/*
 *	OutputStream은 클래스다? import? 인스턴스? 참조형변수 선언? 	
*/