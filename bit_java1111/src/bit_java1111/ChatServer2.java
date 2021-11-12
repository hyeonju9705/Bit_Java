package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;

class ChatThread extends Thread{ //�����带 ����� ���� Ŭ���̾�Ʈ�� ���� ���� ����
	private Socket socketOfServer;
	private static Map<String, PrintWriter> clientsMap; //nickname, message static���� �� ������ ��� Map�� �̰��������� ����ؾ��ؼ�
	private String nickname = null;
	BufferedReader in = null; //�����Է�
	BufferedReader stin = null; //Ű���� �Է�
	PrintWriter out = null;
	
	public ChatThread(Socket socketOfServer) //������� 2�� ������
	{ 
		try {
			in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));//from client 
			out = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream())); //to client
			//�����ڿ��� addclient�� �ҷ��ͼ� addclient�� ������� 3��
			nickname = in.readLine(); //nickname�� �Է¹޴´�. �װ� line���� �д´�
			addClient(nickname,out); // nickname�� out�� �������� ���� message�ϱ� �̰� addClient�� �����Ѵ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public void addClient(String nickname, PrintWriter pw) { //client �����ִ°�...
		System.out.println("������ ������� ���̵�� "+nickname+"�Դϴ�.");
		clientsMap.put(nickname, pw);
		System.out.println(nickname+"���� �����Ͽ����ϴ�."); //����޼��� 
		
	}
	public void sendMassage(String msg) { //�޽����� �����ǵ� �޽����� �ٷιٷ� �Է¹����� ����ϴ� �뵵�ϱ� map��ü�� ������ �ؼ� �����Ϸ��� �ϴ°� �ƴϱ�
		//�׳� ���ϰ� �����ٷ��� ������ �������.
		//�׸��� sendMassage���� ���� ��� ó���� �� ���� ����
		System.out.println(nickname+"���� ������ �ӼӸ��� �����̽��ϴ�.");
		Iterator<String> it = clientsMap.keySet().iterator(); //Iterator�̶�� �Ŵ� ���� �˻��� ���� �÷����� ������ �ݺ� ó�� �ε�
		//�ݺ������� string���� clientsMap�� key���� ������ <String>�� �־��ִ°�!!!
		//keySet()�� ����� ������ key����
		// ***Iterator�� it�ݾ�? �ٵ� Iterator�� ���ĸ� �ݺ� �������ִ°� �´µ� ó���� ó�� ���� �� �ٷ� ������ ���°ž�
		//�ε��� 0���� �����̶�ġ�� iterator ����ϸ� -1���� �����̶� ��� ó������ �ٽ� �������ִ� �׷� ����ΰ���
		String key=""; //Ű �� �ʱ�ȭ (Ű �� : �̸�)
		while(it.hasNext()) { //���� �ݺ����� ���� ��Ұ� ������ true��ȯ -> �������� ���� ������ while�� ������
			key = it.next(); //it ���� key��� �ϴ°ž�. it��ü�� iterator�̴ϱ� ó������ ���ư��� �ε��� ù��°���� key�� �Ǵ°Ŵϱ�
			clientsMap.get(key).println(msg); //key�� �´� message�� ������ִ� ��. get(key)�� key�� �ҷ����°� �ƴ϶� key���´� value�� �ҷ���
			clientsMap.get(key).flush(); //flush�� �� ����� ���۰� �������� ����! �Է¹������� ������ִ� �뵵
		}
	}
	public void removeClient(String nickname) {
		sendMassage(nickname+"���� �����̽��ϴ�.");
		clientsMap.remove(nickname);
	}
	@Override
	public void run() { //������� 2�� ������
		

		try {
			
			String msg;
			while((msg = in.readLine())!=null) {//�׷��� �д°Ű� null�� �ƴҶ�����
				sendMassage(msg); //÷�� Ŭ���̾�Ʈ�� ���� �޽��� �����ϱ� 
			}
		}catch(IOException e) {
			removeClient(nickname);
		}
	}
}
public class ChatServer2 {
	public static void main(String[] args) { // ������� 1�� ���� �޼ҵ�
		// TODO Auto-generated method stub
//		ServerSocket server = null;
//		Socket socketOfServer = null;
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("������ ��ٸ��ϴ�.");
			while(true) {
				Socket socketOfServer = server.accept(); //client�� ������ �Ҷ����� ��ٸ�
				ChatThread chatThread = new ChatThread(socketOfServer);
				chatThread.start(); //start���� ���� thread�� �����°�
			}
		}catch(IOException e) {}
		
	}
	
	    }
