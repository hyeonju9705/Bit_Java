package bit_java1109;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>(); //set�� ����Ǵ� ������ �ǹ̾���
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
