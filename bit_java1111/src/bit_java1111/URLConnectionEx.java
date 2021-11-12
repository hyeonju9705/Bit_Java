package bit_java1111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionEx { //URLConnection ���� ������ �б�
	//getInputStream()Ȱ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// url ��ü ����
			URL url = new URL("https://en.wikipedia.org");
			// url ��ü���� url Connection ��ü ����
			URLConnection uc = url.openConnection();
			BufferedReader in =
				new BufferedReader(new InputStreamReader(uc.getInputStream()));
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
