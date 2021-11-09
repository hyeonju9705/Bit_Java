package PM3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new TreeMap<String, String>();
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("strawberry", "딸기");
		
		Set<String> set = map.keySet(); //set에는 key가 저장됨
		for(String str : set)
			System.out.println(str+ " : "+map.get(str)); //map에서 키를 이용해서 값을 검색
		
		for(String str : map.values())
			System.out.println(str);
	}

}
