package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// url 객체 생성
			URL url = new URL("https://en.wikipedia.org");
			BufferedReader in =
				new BufferedReader(new InputStreamReader(url.openStream()));
				//openStream() 메소드로 입력 스트림 생성
			String inputLine;
			while((inputLine = in.readLine()) != null) //한 행씩 읽음
				System.out.println(inputLine);
			in.close();
		}catch(IOException e) {
			System.out.println("URL에서 데이터를 읽는 중");
		}
	}

}
