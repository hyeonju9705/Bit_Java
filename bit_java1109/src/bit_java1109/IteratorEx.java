package bit_java1109;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("java");
		ll.add("jvm");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next());
		//System.out.println(it.next()); //한 번 방문 했던 데는 다시 방문하지 않음
	
	}

}
