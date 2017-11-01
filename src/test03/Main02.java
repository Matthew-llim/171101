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
		 * input에서 한바이트 읽는다. 변수에 대입, 그 값이 -1이 아닌동안 반복
		 * 한 바이트씩 끝까지 읽어간다.
		 * 반복하는 동안 out으로 내보낸다. -> 결과적으로 복사가 이루어진다.
		 * 다만 아래의 코드는 속도가 느리다.
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
