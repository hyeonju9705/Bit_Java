package bit_java1109;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		//set���� �����͸� �ߺ��ؼ� ������ �� ����
		set.add("�ڳ�");
		set.add("���");
		set.add("�̶�");
		set.add("Ű��");
		set.add("��Ž��");
		set.add("���");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
