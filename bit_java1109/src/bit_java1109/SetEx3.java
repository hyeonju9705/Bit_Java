package bit_java1109;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڳ�");
		list.add("���");
		list.add("�̶�");
		list.add("�ڳ�");
		
		HashSet<String> set = new HashSet<String>(list);
		set.add("Ű��");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
