package bit_java1109;

import java.util.HashMap;
import java.util.Map;

public class BookEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer, Book> map = new HashMap<Integer, Book>();
		map.put(1, new Book(100, "�����", "�߶��㺣��", 5));
		map.put(2, new Book(200, "�ູ�ѿ���", "����ī���ϵ�", 10));
		map.put(3, new Book(300, "�ȷ�Ȩ��", "�ڳ�����", 8));
		for(Map.Entry<Integer, Book> entry : map.entrySet()) { //entrySet() = hashMap�� �ִ� ��� Ű�� ���� ������ ��
			// Set<Map.Entry<key,value>> �÷��� ����
			int key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(key+"�� ���� �׸�");
			System.out.printf("%d %s %s %d\n", book.id, book.title, book.author, book.quantity);
			System.out.println("------------------------------------------------");
		}
	}

}
