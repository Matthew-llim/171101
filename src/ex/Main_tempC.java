package ex;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main_tempC {
	public static void main(String[] args) throws Exception{
		
		Socket skt = new Socket("70.12.113.229", 7890);
		OutputStream out = skt.getOutputStream();
		
		Scanner sc = new Scanner(System.in);
		String temp= sc.nextLine();
		int guest = Integer.parseInt(temp);
		
		out.write(guest);
		
		char[] ch = null;
		String lang = null;
		
		while(true){
			lang = sc.nextLine();
			
			break;
		}
		
		out.close();
		skt.close();
		
		
	}
}
