package PM3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("strawberry", "딸기");
		
		System.out.println(map.get("apple"));
		System.out.println(map.get("orange"));
		System.out.println(map.get("strawberry"));
		
		Set<String> set = map.keySet(); //set에는 key가 저장됨
		for(String str : set)
			System.out.println(map.get(str)); //map에서 키를 이용해서 값을 검색
	}

}
