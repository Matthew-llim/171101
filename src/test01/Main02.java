package test01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main02 {
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("C:\\out.dat");
		
		out.write(100);
		out.write(101);
		out.write(102);
		out.write(103);
		
		out.flush();
		out.close();
		
		
	}
}
/*
 *  �����Ŀ� c:\ Ȯ���غ��� out.dat������ ����� 4����Ʈ ũ���̴�.
 * 	write�ѹ��� 8��Ʈ�� ����.
 * ���󿡼� ����Ǿ����� �������̵��� �Լ��� ȣ���ϴµ� �������̵��� �Լ������� File�� ������ ������ �ִ���.
 * API���� �Ű������� ���� 8��Ʈ�� ����
 */
