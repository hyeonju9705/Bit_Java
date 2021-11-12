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
			OutputStream out = socketOfClient.getOutputStream(); //소켓에 출력스트림 연결
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //출력한거 써주는거..?
			pw.println("Hi, Server"); //서버에 연결된 소켓으로 출력
			pw.flush();
		}catch(Exception e) {}
	}

}
