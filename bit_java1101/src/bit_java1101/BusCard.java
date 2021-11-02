package bit_java1101;

import java.util.Scanner;

public class BusCard {

	public static void main(String[] args) {
		// 버스 1회당 사용요금은 1250원으로 카드를 사용할때마다 사용횟수와 사용후 잔액을
		// 출력하는 프로그램 생성
		// 표준 입력으로 충전금액을 입력
		// 최초 금액을 출력한 다음, 사용 횟수와 함께 잔액을 출력
		//잔액이 부족하면 출력 종료
		
		Scanner scan = new Scanner(System.in);
		System.out.print("최초 충전금액 -->> ");
		int first = scan.nextInt();
		System.out.printf("%d원이 충전되었음\n", first);
		int i=0;
		while(true) {
			first = first-1250;
			i++;
			System.out.printf("%d회 사용한 후 현재 잔액은 %d원\n",i,first);
			if(first<1250) 
				break;
		}

	}

}
