package bit_java1101;

import java.util.Scanner;

public class TemperatureEx {

	public static void main(String[] args) {
		// 기계의 온도를 감지하여 팬을 자동으로 구동하려는 장치를 만드려고한다
		// 다음의 요구사항을 만족하는 프로그램 작성하기
		//기계 온도를 입력
		//기계 온도가 40이상이면 팬가동 출력
		//기계 온도가 40미만이면 팬 중지를 출력
		
		Scanner scan =new Scanner(System.in);
		System.out.print("기계의 온도를 입력하세요: ");
		double temperature = scan.nextDouble(); 
		//next웅앵 타입 안맞춰주면 inputMissmatch
		if(temperature>=40.0)
			System.out.println("팬(Fan) 중지");
		else
			System.out.println("팬(Fan) 가동");

	}

}
