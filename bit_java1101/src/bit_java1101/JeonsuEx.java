package bit_java1101;

import java.util.Scanner;

public class JeonsuEx {

	public static void main(String[] args) {
		// 사용자가 입력한 양의 정수를 3으로 나눈 후, 소수점 첫 자리에서 반올림한
		// 정수를 출력하는 프로그램 작성하기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 입력: ");
		int su = scan.nextInt();
//		double x= (double)su/3;
//		System.out.println("결과 : "+ Math.round(x));
//		math함수 사용 xx
		
		if(su%3>=0.5) {
			System.out.println("결과 : "+(su/3+1));
		}
	}

}
