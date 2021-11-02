package bit_java1101;

import java.util.Scanner;

public class While_4Yeonsan {

	public static void main(String[] args) {
		// 무한반복으로 사칙연산을 계산하는 프로그램 작성하기(강제종료, 나누기는 소숫점 첫째자리까지
		//출력
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력: ");
		int one = scan.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		int two = scan.nextInt();
		System.out.print("연산 기호 입력: ");
		String yeonsan = scan.next();
		
		double result=0;
		switch(yeonsan.charAt(0)){
			case '+':
				result = one+two;
				break;
			case '-':
				result = one-two;
				break;
			case '*':
				result = one*two;
				break;
			case '/':
				result=one/two;
		}
		if(yeonsan.equals("/"))
		System.out.printf("계산 결과는 %.1f\n", result);
		else
			System.out.printf("계산 결과는 %d\n", (int)result);
		}
		
		

	}

}
