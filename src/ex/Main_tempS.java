package ex;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main_tempS {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7890);
		Socket skt = ss.accept();

		InputStream in = skt.getInputStream();//���Ͽ� �ִ°� �޾ƿ´�.
		int guest = in.read();
		
		if(guest==1){
			
		}
		skt.close();
		ss.close();


	}
}
