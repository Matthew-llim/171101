package test04;

import java.io.FileWriter;
import java.io.Writer;

public class Main03 {
	public static void main(String[] args) throws Exception {

		String l = "오늘 날씨가 비가 올지도 모르겠다.";
		String t = "오늘 저녁에는 칼국수를 먹을지도...";

		// java의 문자열을 글자 하나를 담은 char 변수의 배열을 만들어 리턴.
		char[] cs = l.toCharArray();

		Writer out = new FileWriter("C:\\out.txt");

		for (int i = 0; i < cs.length; i++) {
			out.write(cs[i]);
		}
		
		//아래의 두 char를 연달아 써주면 줄 바꿈이 일어난다.
		out.write('\r');
		out.write('\n');
		
		
		cs = t.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			out.write(cs[i]);
		}

		out.flush();
		out.close();

	}
}
