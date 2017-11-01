package test01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main02 {
	public static void main(String[] args) throws Exception{
		OutputStream out = new FileOutputStream("C:\\out.dat");
		
		out.write(100);
		out.write(101);
		out.write(102);
		out.write(103);
		
		out.flush();
		out.close();
		
		
	}
}
/*
 *  실행후에 c:\ 확인해보니 out.dat파일이 생기고 4바이트 크기이다.
 * 	write한번에 8비트를 쓴다.
 * 조상에서 선언되었지만 오버라이딩한 함수를 호출하는데 오버라이딩한 함수에서는 File의 정보를 가지고 있더라.
 * API보니 매개변수의 하위 8비트만 저장
 */
