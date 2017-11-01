package test03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main02 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("C:\\b.exe");
		InputStream in = new FileInputStream("C:\\gcc.exe");
		
		/*
		 * input���� �ѹ���Ʈ �д´�. ������ ����, �� ���� -1�� �ƴѵ��� �ݺ�
		 * �� ����Ʈ�� ������ �о��.
		 * �ݺ��ϴ� ���� out���� ��������. -> ��������� ���簡 �̷������.
		 * �ٸ� �Ʒ��� �ڵ�� �ӵ��� ������.
		 */
		int r = 0;
		while( (r= in.read() ) !=-1){
			out.write(r);
		}
		
		in.close();
		out.flush();
		out.close();
	}
}
