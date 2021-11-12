package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null; //���� �Է�
		BufferedReader stin = null; //Ű���� �Է�
		PrintWriter out = null; //���� �Է�
		Socket socketOfClient = null;
		try {
			socketOfClient = new Socket("localhost", 9999); //Ŭ���̾�Ʈ ���� ����
			in = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine(); //Ű���忡�� �� ���� ���ڿ� ����
				if(outputMessage.equalsIgnoreCase("bye")) { //"bye"�� �ԷµǸ� �޽��� ���� �� ���� ����
					out.println(outputMessage);
					out.flush();
					break;
				}
				out.println("Ŭ���̾�Ʈ>"+outputMessage); //Ű���忡�� ���� ���ڿ� ����
				out.flush();
				String inputMessage = in.readLine(); //�������� �� ���� ���ڿ� ����
				System.out.println(inputMessage); //������ ���� �޽��� ȭ�鿡 ���
			}
		}catch(IOException e){}
		finally {
			try { socketOfClient.close(); //Ŭ���̾�Ʈ ���� �ݱ�
		}catch(IOException e) {}
	}

}}
