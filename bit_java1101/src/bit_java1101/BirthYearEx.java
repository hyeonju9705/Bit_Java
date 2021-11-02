package bit_java1101;

import java.util.Scanner;

public class BirthYearEx {

	public static void main(String[] args) {
		// 출생연도(birthYear)를 입력하면 다음 요구사항에 맞춰 마스크 구매
		// 가능한 요일을 출력하는 프로그램 작성하기
		//공적 마스크 판매 관련해서 출생 연도 끝자리를 이용한 5부제 실시
		//만 65이상 어르신은 언제든지 구매가능
		// 1,6 이면 월 2,7 화 3,8 수 4,9 목
		//중첩 if문 사용
		Scanner scan = new Scanner (System.in);
		System.out.print("출생년도를 입력하세요 -->> ");
		int birthYear = scan.nextInt();
		if(birthYear<=1956)
			System.out.println("언제든지 구매 가능합니다.");
		else {
		int x=birthYear%10; // 끝자리수 구하는거
		String yoil;
		if(x ==0 | x==5) {
			yoil="금";
		} else if(x == 4 | x ==9) {
			yoil = "목";
		} else if(x==3 | x==8) {
			yoil = "수";
		} else if( x==2 | x==7) {
			yoil="화";
		} else
			yoil="월";
		
		System.out.print(yoil+"요일에 구매가능합니다.");
		}
	}

}
