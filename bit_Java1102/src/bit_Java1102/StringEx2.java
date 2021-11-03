package bit_Java1102;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " abcd def ";
		String b = "\txty\t";
		String c = a.trim(); // 앞뒤 tab, enter, space 같은 공백 제거
		String d = b.trim();
		System.out.println(a);
		System.out.println(b);
		System.out.println("trim 시작 =-===========");
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("Hello".charAt(0)); //H
		System.out.println("Hello".charAt(4)); // o
		System.out.println("Hello".indexOf('1', 3)); // 3위치부터 끝까지 '1' 탐색 
		// 잇으면 인덱스 리턴, 없으면 -1리턴
		
		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
	}

}
