package PM3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("orange", "������");
		map.put("strawberry", "����");
		
		System.out.println(map.get("apple"));
		System.out.println(map.get("orange"));
		System.out.println(map.get("strawberry"));
		
		Set<String> set = map.keySet(); //set���� key�� �����
		for(String str : set)
			System.out.println(map.get(str)); //map���� Ű�� �̿��ؼ� ���� �˻�
	}

}
