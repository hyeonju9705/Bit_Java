package bit_java1111;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socketOfClient = new Socket("127.0.0.1",9999);
			OutputStream out = socketOfClient.getOutputStream(); //���Ͽ� ��½�Ʈ�� ����
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //����Ѱ� ���ִ°�..?
			pw.println("Hi, Server"); //������ ����� �������� ���
			pw.flush();
		}catch(Exception e) {}
	}

}
