package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException; //이해가 안되누..

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
			System.out.println("=====이름을 입력하세요=====");
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
		BufferedReader in = null; //소켓 입력
		BufferedReader stin = null; //키보드 입력
		PrintWriter out = null; //소켓 입력
		Socket socketOfClient = null;

		try {

			socketOfClient = new Socket("localhost", 9999); //클라이언트 소켓 생성
			//socket을 생성하여 지정된 호스트와 포트번호에 연결
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


