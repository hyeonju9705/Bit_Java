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
			//일단 in은 밖에서 나한테 들어오는 데이터,
			// out은 내가 밖으로 내보내는 데이터
			ServerSocket server = new ServerSocket(9999);
			System.out.println("접속을 기다립니다.");
			Socket socketOfServer = server.accept(); //연결요청을 기다리다가 연결요청이 들어오면 수락하고 새 socket 객체를 반환
			InetAddress inetaddr = socketOfServer.getInetAddress(); //서버 소켓에 연결된 로컬 주소 변환
			System.out.println(inetaddr.getHostAddress()+"로 부터 접속하였습니다.");
			
			OutputStream out = socketOfServer.getOutputStream(); //소켓에 대한 출력 스트림 반환
			InputStream in = socketOfServer.getInputStream(); //소켓에 대한 입력 스트림 반환
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out)); //입력받는거 !! printWriter은 사용자가 쓰는거 입력받겠다는거
			//사용자가 써서 입력받은 것을 
			BufferedReader br = new BufferedReader(new InputStreamReader(in)); //client로부터 들어온 문자열을 읽는것
			
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println("클라이언트로부터 전송받은 문자열 : "+line); //한 줄을 읽음
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
		String[] splited =line.split(" "); //배열에 저장이됐고,,,
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
			System.out.print("연산식이 잘못됐습니다.");
			break;
		}
		return String.format("%d %s %d = %.1f", Intsplit[0],splited[1],Intsplit[1],result);
		} catch(NumberFormatException e) {
			return "연산식이 잘못됐습니다.";
		}
		
	}

}
