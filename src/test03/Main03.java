package test03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Main03 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("C:\\b.mp4");
		InputStream in = new FileInputStream("C:\\a.mp4");
		
		int len = 0;
		byte[] buf = new byte[1024*8];
		
		
		//bufũ�⸸ŭ ���� ���� len�� �ִ´�.
		while( (len= in.read(buf) ) !=-1){
			//bufũ�⸸ŭ 0���� len���� ����.
			out.write(buf,0,len);
		}
		
		
		in.close();
		out.flush();
		out.close();
	}
}
