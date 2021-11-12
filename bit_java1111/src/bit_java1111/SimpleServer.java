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
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept(); //접근기다리다가 허용해줌
			InputStream in = socketOfServer.getInputStream(); //소켓에 입력스트림 연결
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //입력스트림을 읽는다
			String line = br.readLine(); //소켓에 연결된 클라이언트입력
			System.out.println("받은 문자열 ="+line); //console 출력
		}catch(Exception e) {}
	}

}
