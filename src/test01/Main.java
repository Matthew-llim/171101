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
 *	OutputStream�� Ŭ������? import? �ν��Ͻ�? ���������� ����? 	
*/