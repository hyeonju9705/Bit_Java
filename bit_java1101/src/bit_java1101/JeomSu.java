package bit_java1101;

import java.util.Scanner;

public class JeomSu {

	public static void main(String[] args) {
		// 학점 (A~F)를 입력받아 다음과 같이 출력하느 ㄴ프로그램 작성하기
		// 학점이 A,B인 경우, "참 잘했음"
		// 학점이 C,D인 경우, "좀 더 노력해"
		// 학점이 F인 경우, "다음학기에 다시 만나요"
		//문자열인 경우, 같은지 비교하기 위해서는 equals()사용 ->
		//자바버전 5부터는 case뒤에 값과 조건식과 바로 같은지 equals()없이 비교
		//문자열에서 첫번째 자리만 뽑아내는 메소드 -> charAt(0)
		
		Scanner scan = new Scanner (System.in);
		System.out.print("학점을 입력하시오-->> ");
		String score = scan.next();
		
		switch(score.charAt(0)) { //string이 참조하는 문자열의 첫번째 문자만 뽑아내서 
		//반환하는 메소드
		case 'A':
		case 'B':
			System.out.println("참 잘했음");
			break;
		case 'C':
		case 'D':
			System.out.println("좀 더 노력해");
			break;
		default:
			System.out.println("다음학기에 다시 만나요");
			break;
		}
	}

}
