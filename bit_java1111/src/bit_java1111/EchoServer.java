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
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); //�����û�� ��ٸ��ٰ� �����û�� ������ �����ϰ� �� socket ��ü�� ��ȯ
			InetAddress inetaddr = socketOfServer.getInetAddress(); //���� ���Ͽ� ����� ���� �ּ� ��ȯ
			System.out.println(inetaddr.getHostAddress()+"�� ���� �����Ͽ����ϴ�.");
			OutputStream out = socketOfServer.getOutputStream(); //���Ͽ� ���� ��� ��Ʈ�� ��ȯ
			InputStream in = socketOfServer.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //��½�Ʈ���� ���ִ°�(������ִ°�)�ε�
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : "+line);
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
