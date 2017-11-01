package ex;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main_S {
	
	
	
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7890);
		Socket skt = ss.accept();
		
		InputStream in = new FileInputStream("C:\\gcc.exe");
		OutputStream out = skt.getOutputStream();
		
		
		int r=0;
		
		while((r=in.read())!=-1){
			out.write(r);
			out.flush();
		}
		
		out.close();
		in.close();
		
		skt.close();
		ss.close();
		
		
		
		
	}
}
