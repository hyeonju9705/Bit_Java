package PM3;

import java.util.HashMap;
import java.util.Map;

public class EntrySetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "바나나");
		map.put(2, "사과");
		map.put(3,  "오렌지");
		
		for(Map.Entry m : map.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		map.remove(1);
		System.out.println("삭제후 ---------------");
		for(Map.Entry m: map.entrySet())
			System.out.println(m.getKey()+" "+ m.getValue());
	}

}
