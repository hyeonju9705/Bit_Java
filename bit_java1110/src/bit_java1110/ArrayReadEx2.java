package bit_java1110;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ArrayReadEx2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("c:/temp/test3.txt"); // 20,30,40�� �־���� ����
		byte[] buffer = new byte[5];
		int count;
		while((count = is.read(buffer,2,3))!= -1) { //�迭 �ε��� 2���� 3��(test3.txt ����) �о����
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
