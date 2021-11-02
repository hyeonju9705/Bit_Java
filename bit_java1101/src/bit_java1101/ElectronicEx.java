package bit_java1101;

import java.util.Scanner;

public class ElectronicEx {

	public static void main(String[] args) {
		// 전기요금 계산 프로그램
		// 전기를 많이 사용하면 누진율이 적용되어 단가와 기본요금이 상승한다
		// 다음의 단가표를 참고하여 전기 사용량을 입력하면 전기료가 출력되는 프로그램작성
		// 기본요금+(사용량*단가) if조건문 사용
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("전기 사용량을 입력하세요 --> ");
		double yang = scan.nextDouble();
		double y,z; //기본요금,단가
		
		if(yang<=200) {
			y=910; z=99.3;
		}else if(yang<=400) {
			y= 1600; z= 187.9;
		}	
		else
			y= 7300; z= 280.6;
			
		double money = yang+(y*z); //전기요금
		System.out.printf("사용량: %5.1f km/h\n",yang);
		System.out.printf("기본 요금 : %5.1f원\n", y);
		System.out.printf("단가 : %5.1f원\n", z);
		System.out.printf("전기 요금 : %6.1f 원", money);

	}

}
