package bit_java1109;

import java.util.HashMap;
import java.util.Map;

public class BindoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
		
		for(String a : sample) {
			Integer freq = m.get(a); //get(index) = 저장된 인덱스의 요소 반환
			m.put(a, (freq == null) ? 1 : freq+1); // put(key, Value) = key와 value를 매핑하여 hashMap에 저장
		}
		System.out.println(m.size()+" 단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	 }

}
