package bit_java1101;

import java.util.Scanner;

public class BusRoadEx {

	public static void main(String[] args) {
		// 버스 전용차로 단속 프로그램
		// 버스 전용차로에 버스가 아닌 차종이 주행할 경우 단속
		// 단 토요일 및 공휴일은 단속을 하지 않음
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.월~금 2.토요일 3.공휴일");
		System.out.print("요일을 선택하세요(1~3) -->");
		int yoil=scan.nextInt();
		
		if(yoil==1) {
			System.out.println("버스 전용차로 단속중입니다.");
			
			System.out.print("차종을 선택하세요(1,2)--> ");
			int car = scan.nextInt();
			
			if(car==1)
				System.out.println("버스임");
			else
				System.out.println("버스 전용차로 위반!!");
		} else 
			System.out.println("토요일, 공휴일은 단속하지 않아요~");
		
		
		
	}

}
