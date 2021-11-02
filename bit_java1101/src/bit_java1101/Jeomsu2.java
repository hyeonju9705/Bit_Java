package bit_java1101;

import java.util.Scanner;

public class Jeomsu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("점수를 입력하시오-->> ");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
		case 8:
			System.out.println("참 잘했음");
			break;
		case 7:
		case 6:
		case 5:
			System.out.println("좀 더 노력해");
			break;
		default:
			System.out.println("다음학기에 다시 만나요");
			break;
		}
	}

}
