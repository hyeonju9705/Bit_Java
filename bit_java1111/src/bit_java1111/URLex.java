package bit_java1111;

import java.net.MalformedURLException;
import java.net.URL;

public class URLex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.exit(1);
		}
		URL url = null;
		try {
			url = new URL(args[0]);
		} catch(MalformedURLException e) {
			System.out.println("�߸��� URL �����Դϴ�.");
			System.out.println(e);
			System.exit(1);
		}
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("ȣ��Ʈ �̸� : "+url.getHost());
		System.out.println("��Ʈ��ȣ : "+url.getPort());
		System.out.println("�����̸� : "+url.getPath());
		System.out.println("����� ���� : "+url.getQuery());
	}

}