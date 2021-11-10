package bit_java1110;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ByteReadEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("c:/temp/test1.txt");
		int data;
		while((data=is.read())!=-1) { //파일의 끝에 도달
			System.out.println(data);
		}
		is.close();
	}

}
