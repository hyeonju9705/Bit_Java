package bit_java1110;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ArrayReadEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("c:/temp/test2.txt");
		byte[] buffer = new byte[100];
		int count;
		while((count = is.read(buffer))!= -1) {
			for(int i=0; i<count; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
