package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class WebReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// url ��ü ����
			URL url = new URL("https://en.wikipedia.org");
			BufferedReader in =
				new BufferedReader(new InputStreamReader(url.openStream()));
				//openStream() �޼ҵ�� �Է� ��Ʈ�� ����
			String inputLine;
			while((inputLine = in.readLine()) != null) //�� �྿ ����
				System.out.println(inputLine);
			in.close();
		}catch(IOException e) {
			System.out.println("URL���� �����͸� �д� ��");
		}
	}

}
