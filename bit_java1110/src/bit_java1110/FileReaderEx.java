package bit_java1110;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in = null;
		try {
			in = new FileReader("c:/windows/system.ini");
			int c;
			while((c=in.read())!= -1) { //�� ���ھ�
				System.out.print((char)c);
			}
			in.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}

}
