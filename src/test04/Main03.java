package test04;

import java.io.FileWriter;
import java.io.Writer;

public class Main03 {
	public static void main(String[] args) throws Exception {

		String l = "���� ������ �� ������ �𸣰ڴ�.";
		String t = "���� ���ῡ�� Į������ ��������...";

		// java�� ���ڿ��� ���� �ϳ��� ���� char ������ �迭�� ����� ����.
		char[] cs = l.toCharArray();

		Writer out = new FileWriter("C:\\out.txt");

		for (int i = 0; i < cs.length; i++) {
			out.write(cs[i]);
		}
		
		//�Ʒ��� �� char�� ���޾� ���ָ� �� �ٲ��� �Ͼ��.
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
