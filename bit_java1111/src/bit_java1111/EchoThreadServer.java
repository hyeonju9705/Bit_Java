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

class EchoThread extends Thread{ //�����带 ����� ���� Ŭ���̾�Ʈ�� ���� ���� ����
	private Socket socketOfServer;
	public EchoThread(Socket socketOfServer) { this.socketOfServer = socketOfServer; }
	@Override
	public void run() {
		try {
			InetAddress inetaddr = socketOfServer.getInetAddress(); //���� ���Ͽ� ����� �����ּ� ��ȯ
			System.out.println(inetaddr.getHostAddress()+"�κ��� �����Ͽ����ϴ�."); //�ּҰ� ��µ�
			OutputStream out = socketOfServer.getOutputStream();//����� �� �� �� out�� ����
			InputStream in = socketOfServer.getInputStream(); //Ŭ���̾�Ʈ�� �����°� ������ �Է½�Ʈ��
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); // �Է¹޴°� = printWriter ����Ұ��� �Է¹ްڴ�...?
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //�츮�� �� �� �ִ� �ѱ� �����ɷ� �������� ������ bufferedReader����ؼ�
			//BufferedReader�� ������ ��. inputStreamReader�� �����Ŵ� ��ǻ�Ͱ� ������(?) �׷����ΰ���
			String line = null;
			while((line = br.readLine()) != null) {//�׷��� �д°Ű� null�� �ƴҶ�����
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : "+line); //������ ������ְ�
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
			System.out.println("������ ��ٸ��ϴ�.");
			while(true) {
				Socket socketOfServer = server.accept();
				EchoThread echoThread = new EchoThread(socketOfServer);
				echoThread.start();
			}
		}catch(IOException e) {}
	}

}
