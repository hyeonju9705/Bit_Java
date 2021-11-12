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
		BufferedReader in = null; //소켓 입력
		BufferedReader stin = null; //키보드 입력
		PrintWriter out = null; //소켓 입력
		Socket socketOfClient = null;
		try {
			socketOfClient = new Socket("localhost", 9999); //클라이언트 소켓 생성
			in = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
			String outputMessage;
			while(true) {
				outputMessage = stin.readLine(); //키보드에서 한 행의 문자열 읽음
				if(outputMessage.equalsIgnoreCase("bye")) { //"bye"가 입력되면 메시지 전송 후 연결 종료
					out.println(outputMessage);
					out.flush();
					break;
				}
				out.println("클라이언트>"+outputMessage); //키보드에서 읽은 문자열 전송
				out.flush();
				String inputMessage = in.readLine(); //서버에서 한 행의 문자열 읽음
				System.out.println(inputMessage); //서버가 보낸 메시지 화면에 출력
			}
		}catch(IOException e){}
		finally {
			try { socketOfClient.close(); //클라이언트 소켓 닫기
		}catch(IOException e) {}
	}

}}
