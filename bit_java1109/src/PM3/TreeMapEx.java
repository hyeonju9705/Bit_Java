package PM3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new TreeMap<String, String>();
		map.put("apple", "���");
		map.put("orange", "������");
		map.put("strawberry", "����");
		
		Set<String> set = map.keySet(); //set���� key�� �����
		for(String str : set)
			System.out.println(str+ " : "+map.get(str)); //map���� Ű�� �̿��ؼ� ���� �˻�
		
		for(String str : map.values())
			System.out.println(str);
	}

}
