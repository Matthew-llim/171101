package test07;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main03_C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("70.12.113.229", 7890);
		OutputStream out = new FileOutputStream("C:\\a.exe");
		InputStream in = skt.getInputStream();
		
		int r=0;
		while((r=in.read())!=-1){
			out.write(r);
		}
		
		skt.close();
		in.close();
		out.close();
		
	}
}
