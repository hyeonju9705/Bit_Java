package bit_java1101;

import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {
		// 시험점수가 80점 이상이면 합격을 판별을 하는 프로그램 작성하기(if문 사용)
		
		Scanner scan = new Scanner(System.in) ;
		
		int score = 0;
		System.out.print("점수를 입력하시오 -->> ");
		score = scan.nextInt();
		if(score>=80)
			System.out.println("축하합니다! 합격입니다.");
		else
			System.out.println("불합격입니다. 좀 더 노력해");
	}

}
