package bit_java1111;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); //���ٱ�ٸ��ٰ� �������
			InputStream in = socketOfServer.getInputStream(); //���Ͽ� �Է½�Ʈ�� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //�Է½�Ʈ���� �д´�
			String line = br.readLine(); //���Ͽ� ����� Ŭ���̾�Ʈ�Է�
			System.out.println("���� ���ڿ� ="+line); //console ���
		}catch(Exception e) {}
	}

}
