package test06;

import java.io.InputStream;
import java.net.Socket;

public class Main_C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("70.12.113.229", 7890);
		
//		�߰��κ� ����
		InputStream in = skt.getInputStream();
		int r = in.read();
		in.close();
		
		System.out.println("Client : "+r);
//		�߰��κ� ��
		
		
		skt.close();
	}
}
