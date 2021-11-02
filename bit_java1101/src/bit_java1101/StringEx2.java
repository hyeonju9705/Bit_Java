package bit_java1101;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호를 입력하세요 >> ");
		String one = "1111";
		
		//문자열을 만드는 방법에 따라 같은지 다른지 결정됨
		String str = scan.next();
		System.out.printf("입력받은 비번은 %s임\n", str);
	}

}
