package bit_java1109;

import java.util.HashMap;
import java.util.Scanner;

public class WordEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("love", "사랑");
		map.put("apple", "사과");
		map.put("baby", "아기");
		
		for(int i=0; i<map.size(); i++) {
		System.out.print("찾고싶은 단어는? ");
		String word=scan.next();
		if(map.get(word)==null) {
			System.out.println("니가찾는 단어는 없음");
		} else
			System.out.println(map.get(word));
		
		}
	}

}
