package test06;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main_S {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(7890);
		Socket skt = ss.accept();

//		�߰��� �κ� ����
		System.out.println(skt.toString());
		OutputStream out = skt.getOutputStream();
		
		out.write(100);
		out.flush();
		out.close();
//		�߰��� �κ� ��

		skt.close();
		ss.close();
	}
}
