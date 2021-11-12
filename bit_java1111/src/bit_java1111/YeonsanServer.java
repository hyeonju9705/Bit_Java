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

public class YeonsanServer {
	static int[] Intsplit = new int[20];
	static String token;
	public static void main(String[] args) {
		String str2 = null;
		int amount =0;
		int flag=0;
		// TODO Auto-generated method stub
		try {
			//�ϴ� in�� �ۿ��� ������ ������ ������,
			// out�� ���� ������ �������� ������
			ServerSocket server = new ServerSocket(9999);
			System.out.println("������ ��ٸ��ϴ�.");
			Socket socketOfServer = server.accept(); //�����û�� ��ٸ��ٰ� �����û�� ������ �����ϰ� �� socket ��ü�� ��ȯ
			InetAddress inetaddr = socketOfServer.getInetAddress(); //���� ���Ͽ� ����� ���� �ּ� ��ȯ
			System.out.println(inetaddr.getHostAddress()+"�� ���� �����Ͽ����ϴ�.");
			
			OutputStream out = socketOfServer.getOutputStream(); //���Ͽ� ���� ��� ��Ʈ�� ��ȯ
			InputStream in = socketOfServer.getInputStream(); //���Ͽ� ���� �Է� ��Ʈ�� ��ȯ
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //�Է¹޴°� !! printWriter�� ����ڰ� ���°� �Է¹ްڴٴ°�
			//����ڰ� �Ἥ �Է¹��� ���� 
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //client�κ��� ���� ���ڿ��� �д°�
			
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۹��� ���ڿ� : "+line); //�� ���� ����
				pw.println(calculate(line)); 
				pw.flush();
			}
			pw.close();
			br.close();
			socketOfServer.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public static String calculate(String line) {
		double result = 0.0;
		String[] splited =line.split(" "); //�迭�� �����̵ư�,,,
		try {
		Intsplit[0]=Integer.parseInt(splited[0]);
		Intsplit[1]=Integer.parseInt(splited[2]);
		switch(splited[1]) {
		case "+":
			result=Intsplit[0]+Intsplit[1];
			break;
		case "-":
			result=Intsplit[0]-Intsplit[1];
			break;
		case "/":
			result=((double)Intsplit[0]/Intsplit[1]);
			break;
		case "*":
			result=Intsplit[0]*Intsplit[1];
			break;
		default:
			System.out.print("������� �߸��ƽ��ϴ�.");
			break;
		}
		return String.format("%d %s %d = %.1f", Intsplit[0],splited[1],Intsplit[1],result);
		} catch(NumberFormatException e) {
			return "������� �߸��ƽ��ϴ�.";
		}
		
	}

}
