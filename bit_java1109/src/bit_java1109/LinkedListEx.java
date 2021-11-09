package bit_java1109;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("java");
		ll.add("jvm");
		
		for(String str : ll) {
			System.out.println(str);
		}
	}

}
