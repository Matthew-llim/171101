package test04;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *	�ѱ۱����ذ�
 */
public class Main {
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("C:\\out.txt");
		
		int r = '��';
		out.write(r);
		
		out.flush();
		out.close();
	}
}
/*
 * ���� ���α׷��� �����ϸ� ���ڰ� ������.
 * mp3 ���ϰ��� ���������� OutputStream���� �����ص� ��������
 * ���ڵ����ʹ� OutputStream���� �����ϸ� ������.
 * (1���ڴ� 2����Ʈ�� �� ���ڸ� �ɰ��� ������ �ϱ� ������) 
 * 
 * �ذ� : �ѹ��� 2����Ʈ�� �����ϴ� ���ο� Ŭ������ �����ߴ�.
 * Reader �� Writer �ε� InputStream�� OutputStream�� ����� ����� ����
 */
