package bit_java1111;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept(); //연결요청을 기다리다가 연결요청이 들어오면 수락하고 새 socket 객체를 반환
			InetAddress inetaddr = socketOfServer.getInetAddress(); //서버 소켓에 연결된 로컬 주소 변환
			System.out.println(inetaddr.getHostAddress()+"로 부터 접속하였습니다.");
			OutputStream out = socketOfServer.getOutputStream(); //소켓에 대한 출력 스트림 반환
			InputStream in = socketOfServer.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //출력스트림을 써주는거(출력해주는거)인듯
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println("클라이언트로부터 전송받은 문자열 : "+line);
				pw.println(line);
				pw.flush();
			}
			pw.close();
			br.close();
			socketOfServer.close();
		}catch(Exception e) {
			System.out.println(e);
		}// main
	}

}
