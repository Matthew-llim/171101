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
		
		
		//buf크기만큼 읽은 것을 len에 넣는다.
		while( (len= in.read(buf) ) !=-1){
			//buf크기만큼 0부터 len까지 쓴다.
			out.write(buf,0,len);
		}
		
		
		in.close();
		out.flush();
		out.close();
	}
}
