package bit_java1101;

public class Nonli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a'>'b');//char, false
		System.out.println("a"=="b"); // 참조형은 동등비교 가능
		System.out.println("a">"b"); //참조형은 크기 비교 불가
		System.out.println(true>false);
		System.out.println((3<=5)&& (1<0)); //유저네임이 일치하는가,
		//비밀번호가 일치하는가
		System.out.println((3==5))
		
		int x=1; int y=2;
		int s =(x>y) ? 1: -1; // 만약 x>y가 참이면 결과는 1, 거짓이면 -1
		System.out.println(s);
		s = !(x>y) ? 1: -1;
		System.out.println(s);
	}

}
