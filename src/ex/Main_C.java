package ex;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main_C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("70.12.113.229", 7890);
		InputStream in = skt.getInputStream();
		OutputStream out = new FileOutputStream("C:\\temp.exe");
		
		int r = 0;
		while((r=in.read())!=-1){
			out.write(r);
			out.flush();
		}
		out.close();
		in.close();
		skt.close();
	}
}
