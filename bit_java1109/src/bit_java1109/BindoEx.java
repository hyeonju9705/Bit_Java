package bit_java1109;

import java.util.HashMap;
import java.util.Map;

public class BindoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
		
		for(String a : sample) {
			Integer freq = m.get(a); //get(index) = ����� �ε����� ��� ��ȯ
			m.put(a, (freq == null) ? 1 : freq+1); // put(key, Value) = key�� value�� �����Ͽ� hashMap�� ����
		}
		System.out.println(m.size()+" �ܾ �ֽ��ϴ�.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	 }

}
