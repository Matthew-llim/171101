package test05;

import java.net.ServerSocket;
import java.net.Socket;

public class Main_S {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7890);
		Socket skt = ss.accept();
		
		System.out.println(skt.toString());
		
		skt.close();
		ss.close();
	}
}
