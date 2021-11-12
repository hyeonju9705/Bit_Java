package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null; //�����Է�
		BufferedReader stin = null; //Ű���� �Է�
		PrintWriter out = null;
		ServerSocket server = null;
		Socket socketOfServer = null;
		try {
			server = new ServerSocket(9999); //���� ���� ����
			socketOfServer = server.accept(); //Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("�����");
			in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream())); //from client
			stin = new BufferedReader(new InputStreamReader(System.in)); //Ű����κ����� �Է�
			out = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream())); //to client
			String inputMessage;
			while(true) { //�� ������ ������ ��Ű�ԵǾ�����
				inputMessage = in.readLine(); //Ŭ���̾�Ʈ���� �� ���� ���ڿ� ����
				if(inputMessage.equalsIgnoreCase("bye")) //Ŭ���̾�Ʈ�� "bye"�� ������ ���� ����
					break;
				System.out.println(inputMessage); //Ŭ���̾�Ʈ�� ���� �޽��� ȭ�鿡 ���
				String outputMessage = stin.readLine(); //Ű���忡�� �� ���� ���ڿ� ����
				out.println("����>"+outputMessage); //Ű���忡�� ���� ���ڿ� ����
				out.flush();
			}
		}catch(IOException e) {}
		finally {
			try {
				socketOfServer.close();
				server.close();
			}catch(IOException e) {}
		}
	}

}
