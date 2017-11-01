package test04;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *	한글깨짐해결
 */
public class Main {
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("C:\\out.txt");
		
		int r = '한';
		out.write(r);
		
		out.flush();
		out.close();
	}
}
/*
 * 위의 프로그램을 싱행하면 문자가 깨진다.
 * mp3 파일같은 이진파일은 OutputStream으로 전송해도 괜찮지만
 * 문자데이터는 OutputStream으로 전송하면 깨진다.
 * (1글자는 2바이트라서 한 글자를 쪼개서 보내야 하기 때문에) 
 * 
 * 해결 : 한번에 2바이트씩 전송하는 새로운 클래스를 개발했다.
 * Reader 와 Writer 인데 InputStream과 OutputStream과 비슷한 용법을 가짐
 */
