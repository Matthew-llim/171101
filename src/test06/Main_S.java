package test06;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main_S {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7890);
		Socket skt = ss.accept();

//		추가된 부분 시작
		System.out.println(skt.toString());
		OutputStream out = skt.getOutputStream();
		
		out.write(100);
		out.flush();
		out.close();
//		추가된 부분 끝

		skt.close();
		ss.close();
	}
}
