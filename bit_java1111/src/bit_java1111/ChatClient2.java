package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException; //���ذ� �ȵǴ�..

class CatingInThread extends Thread {
	BufferedReader in = null;
	String outputMessage;

	public CatingInThread(Socket socketOfCilent) {
		try {
			in = new BufferedReader(new InputStreamReader(socketOfCilent.getInputStream()));
		} catch (IOException e) {
		}
	}

	public void run() {
		try {
			while (true) {
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		} catch (IOException e) {
		}
	}
}

class CatingOutThread extends Thread {
	BufferedReader stin = null;
	PrintWriter out = null;
	String outputMessage;
	String name;

	public CatingOutThread(Socket socketOfCilent) {
		try {
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(socketOfCilent.getOutputStream()));
			System.out.println("=====�̸��� �Է��ϼ���=====");
			outputMessage = stin.readLine();
			name = outputMessage;
			out.println(name);
			out.flush();
		} catch (IOException e) {
		}
	}

	public void run() {
		try {
			while (true) {
				outputMessage = stin.readLine();
				if (outputMessage.equalsIgnoreCase("quick")) {
					out.println(outputMessage);
					out.flush();
					break;
				}
				out.println(name + " : " + outputMessage);
				out.flush();
			}
		} // catch(InterruptedException e) {System.out.println();}
		catch (IOException e) {}
		
	}
}

public class ChatClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null; //���� �Է�
		BufferedReader stin = null; //Ű���� �Է�
		PrintWriter out = null; //���� �Է�
		Socket socketOfClient = null;

		try {

			socketOfClient = new Socket("localhost", 9999); //Ŭ���̾�Ʈ ���� ����
			//socket�� �����Ͽ� ������ ȣ��Ʈ�� ��Ʈ��ȣ�� ����
			CatingInThread ci = new CatingInThread(socketOfCilent);
			CatingOutThread co = new CatingOutThread(socketOfCilent);
			
			ci.start();
			co.start();
			
		}catch(UnknownHostException e){
			System.out.println(e);
		}
		catch(IOException e) {}

		}
	}
}


