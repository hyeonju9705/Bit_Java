package bit_java1109;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");//항상 마지막 인덱스에 추가됨
		System.out.println(al.size());
		al.add(2,"stupid"); //insert같은 느낌
		
		System.out.println(al.get(2));
		
		al.add(5, "stupid");
		
		System.out.println("2번 위치에 삽입하기 전임");
		System.out.println(al.get(2));
		al.add(2,"stupid");
		
		System.out.println("1번 위치 삭제하기 전임");
		System.out.println(al.get(1));
		al.remove(1);
		System.out.println("1번 위치 삭제한 다음 ");
		System.out.println(al.get(1));
		
		al.remove(10); //오류발생
	}

}
