package test04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Main02 {
	public static void main(String[] args) throws Exception{
		Writer out = new FileWriter("C:\\out.txt");
		
		int r = '��';
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
 * java�� char�� 2����Ʈ ũ��� Writer�� write�� �ѹ��� 2����Ʈ�� ����
 * -Writer�� write�� �̿��Ͽ� ������ ���� ������ �ȱ�����. 	
*/