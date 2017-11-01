package test05;

import java.net.Socket;

public class Main_C {
	public static void main(String[] args) throws Exception{
		Socket skt = new Socket("70.12.113.230", 7890);
		
		skt.close();
	}
}
