package test06;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main01_C {
	public static void main(String[] args) throws Exception {
		Socket skt = new Socket("70.12.113.229", 7890);

		// 추가부분 시작
		OutputStream out = new FileOutputStream("C:\\download.exe");
		InputStream in = skt.getInputStream();
		int r = 0;
		while ((r = in.read()) != -1) {
			out.write(r);
		}
		in.close();
		out.close();
		System.out.println("Client : " + r);
		// 추가부분 끝

		skt.close();
	}
}
