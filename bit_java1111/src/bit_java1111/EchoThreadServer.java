package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread{ //쓰레드를 사용해 여러 클라이언트를 위한 소켓 생성
	private Socket socketOfServer;
	public EchoThread(Socket socketOfServer) { this.socketOfServer = socketOfServer; }
	@Override
	public void run() {
		try {
			InetAddress inetaddr = socketOfServer.getInetAddress(); //서버 소켓에 연결된 로컬주소 변환
			System.out.println(inetaddr.getHostAddress()+"로부터 접속하였습니다."); //주소가 출력됨
			OutputStream out = socketOfServer.getOutputStream();//출력해 줄 것 을 out에 저장
			InputStream in = socketOfServer.getInputStream(); //클라이언트가 보내는게 들어오는 입력스트림
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); // 입력받는거 = printWriter 출력할것을 입력받겠다...?
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //우리가 볼 수 있는 한글 같은걸로 읽을때는 무조건 bufferedReader써야해서
			//BufferedReader로 감싸준 것. inputStreamReader로 읽은거는 컴퓨터가 읽은거(?) 그런거인가봐
			String line = null;
			while((line = br.readLine()) != null) {//그래서 읽는거가 null이 아닐때까지
				System.out.println("클라이언트로부터 전송받은 문자열 : "+line); //읽은거 출력해주고
				pw.println(line);
				pw.flush();
			}
			pw.close();
			br.close();
			socketOfServer.close();
		}catch(IOException e) {}
	}
}
public class EchoThreadServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			while(true) {
				Socket socketOfServer = server.accept();
				EchoThread echoThread = new EchoThread(socketOfServer);
				echoThread.start();
			}
		}catch(IOException e) {}
	}

}
