package bit_java1101;

import java.util.Scanner;

public class BumperCar {

	public static void main(String[] args) {
		// 놀이동산에서 범퍼카는 신장이 125cm 이상인 어린이만 탑승할 수 있다.
		//신장을 입력하면 탑승 가능 여부를 알려주는 프로그램 작성하기
		// (단, 가능은 true, 불가능은 false로 출력)
		Scanner scan = new Scanner(System.in);
		System.out.print("어린이의 신장(cm)을 입력하세요: ");
		int height = scan.nextInt();
		boolean dekiru=height>=125 && height<165; 
		System.out.println(dekiru); // println(height>=125)로 해도좋을듯
	}

}
