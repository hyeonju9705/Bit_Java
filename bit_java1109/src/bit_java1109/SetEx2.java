package bit_java1109;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		//set에는 데이터를 중복해서 저장할 수 없음
		set.add("코난");
		set.add("장미");
		set.add("미란");
		set.add("키드");
		set.add("유탐정");
		set.add("장미");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
