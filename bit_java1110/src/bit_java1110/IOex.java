package bit_java1110;

import java.io.IOException;

public class IOex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int b, len = 0;
		int bArray[] = new int[100];
		
		System.out.println("--- �Է� ��Ʈ�� ---");
		while((b=System.in.read())!='\n') { //����Ű�� �Է��� ������
			System.out.printf("%c(%d)", (char)b,b);
			bArray[len++]=b;
		}
		
		System.out.println("\n\n--- ��½�Ʈ�� ---");
		for(int i=0; i<len; i++) {
			System.out.write(bArray[i]);
		}
		System.out.flush(); //System.out.close()
	}

}
