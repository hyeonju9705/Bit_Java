package bit_java1109;

import java.util.HashMap;
import java.util.Scanner;

public class WordEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("love", "���");
		map.put("apple", "���");
		map.put("baby", "�Ʊ�");
		
		for(int i=0; i<map.size(); i++) {
		System.out.print("ã����� �ܾ��? ");
		String word=scan.next();
		if(map.get(word)==null) {
			System.out.println("�ϰ�ã�� �ܾ�� ����");
		} else
			System.out.println(map.get(word));
		
		}
	}

}
