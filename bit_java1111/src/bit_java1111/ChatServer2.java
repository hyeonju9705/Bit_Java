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

class ChatThread extends Thread{ //쓰레드를 사용해 여러 클라이언트를 위한 소켓 생성
	private Socket socketOfServer;
	private static Map<String, PrintWriter> clientsMap; //nickname, message static으로 한 이유는 계속 Map을 이곳저곳에서 사용해야해서
	private String nickname = null;
	BufferedReader in = null; //소켓입력
	BufferedReader stin = null; //키보드 입력
	PrintWriter out = null;
	
	public ChatThread(Socket socketOfServer) //실행순서 2번 생성자
	{ 
		try {
			in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));//from client 
			out = new PrintWriter(new OutputStreamWriter(socketOfServer.getOutputStream())); //to client
			//생성자에서 addclient를 불러와서 addclient가 실행순서 3번
			nickname = in.readLine(); //nickname을 입력받는다. 그걸 line별로 읽는다
			addClient(nickname,out); // nickname과 out이 서버에서 보낼 message니까 이걸 addClient에 저장한다
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	public void addClient(String nickname, PrintWriter pw) { //client 더해주는것...
		System.out.println("접속한 사용자의 아이디는 "+nickname+"입니다.");
		clientsMap.put(nickname, pw);
		System.out.println(nickname+"님이 접속하였습니다."); //센드메세지 
		
	}
	public void sendMassage(String msg) { //메시지를 받을건데 메시지는 바로바로 입력받은걸 출력하는 용도니까 map자체에 저장을 해서 보관하려고 하는건 아니구
		//그냥 편하게 보여줄려고 변수를 만든거임.
		//그리고 sendMassage에서 거의 모든 처리를 다 해줄 것임
		System.out.println(nickname+"님이 다음의 귓속말을 보내셨습니다.");
		Iterator<String> it = clientsMap.keySet().iterator(); //Iterator이라는 거는 순차 검색을 위한 컬렉션의 데이터 반복 처리 인데
		//반복적으로 string값을 clientsMap의 key들의 모음을 <String>에 넣어주는것!!!
		//keySet()은 저장된 값들의 key모음
		// ***Iterator는 it잖아? 근데 Iterator가 뭐냐면 반복 실행해주는거 맞는데 처음에 처음 가진 값 바로 전으로 가는거야
		//인덱스 0부터 시작이라치면 iterator 사용하면 -1부터 시작이라 계속 처음부터 다시 실행해주는 그런 기능인거지
		String key=""; //키 값 초기화 (키 값 : 이름)
		while(it.hasNext()) { //다음 반복에서 사용될 요소가 있으면 true반환 -> 다음값이 있을 때까지 while문 돌려라
			key = it.next(); //it 값이 key라고 하는거야. it자체가 iterator이니까 처음부터 돌아가면 인덱스 첫번째값이 key가 되는거니까
			clientsMap.get(key).println(msg); //key에 맞는 message를 출력해주는 것. get(key)는 key를 불러오는게 아니라 key에맞는 value를 불러옴
			clientsMap.get(key).flush(); //flush를 꼭 해줘야 버퍼가 가득차지 않음! 입력받은것을 출력해주는 용도
		}
	}
	public void removeClient(String nickname) {
		sendMassage(nickname+"님이 나가셨습니다.");
		clientsMap.remove(nickname);
	}
	@Override
	public void run() { //실행순서 2번 쓰레드
		

		try {
			
			String msg;
			while((msg = in.readLine())!=null) {//그래서 읽는거가 null이 아닐때까지
				sendMassage(msg); //첨에 클라이언트가 먼저 메시지 보내니깐 
			}
		}catch(IOException e) {
			removeClient(nickname);
		}
	}
}
public class ChatServer2 {
	public static void main(String[] args) { // 실행순서 1번 메인 메소드
		// TODO Auto-generated method stub
//		ServerSocket server = null;
//		Socket socketOfServer = null;
		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			while(true) {
				Socket socketOfServer = server.accept(); //client가 접속을 할때까지 기다림
				ChatThread chatThread = new ChatThread(socketOfServer);
				chatThread.start(); //start땜에 이제 thread로 가지는것
			}
		}catch(IOException e) {}
		
	}
	
	    }
