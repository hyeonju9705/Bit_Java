package bit_java1110;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("c:/temp/test1.txt"); //test1 파일이 자동생성됨
		os.write((byte)10);
		os.write((byte)20);
		os.write((byte)30);
		os.flush();
		os.close();
	}

}
