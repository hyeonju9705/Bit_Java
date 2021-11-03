package bit_Java1102;

public class StringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" abcd");
		String b = new String(",efg");
		
		a=a.concat(b); //a랑 b를 이음 ->  abcd,efg
		System.out.println(a);
		a= a.trim(); //공백 제거됨
		System.out.println(a);
		
		a=a.replace("ab", "12"); // ab를 12로 바꿈
		System.out.println(a); // 12cd,efg
		
		String s[] = a.split(","); // ,를 중심으로 문자열 분리 -> 12cd / efg
		for(int i=0; i<s.length; i++)
			System.out.println("분리된 "+i+"번 문자열: "+s[i]);
		//분리된 0번 문자열 12cd
		//분리된 1번 문자열 efg
		
		a= a.substring(3); //d,efg 인덱스 3번부터시작하는 string 반환
		System.out.println(a);
		char c= a.charAt(2); // d,efg에서 인덱스 2번째 문자 출력
		System.out.println(c); //e
	}

}
