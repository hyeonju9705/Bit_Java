package bit_java1101;

import java.util.Scanner;

public class SeaDeepEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.print("수심을 입력하세요: ");
//		int Deep= scan.nextInt();
//		
//		int level=(Deep/10);
//		double depth = 20-(level*0.7);
//		if(Deep<10) {
//		System.out.println("수온 : 20");
//		} else {
//			System.out.println("수온 : "+depth);
//		} //내가 쓴거는 9.9일때의 에러를 방지못함
		
//		20
//		19.3
//		18.6
//		17.9    10m씩 내려갈때마다 0.7씩 내려간다..... 
		
		//학원 잘하는애 의 답
		double temperature = 20.0;		// 기본 해수면 온도 20도
		Scanner scan = new Scanner(System.in);	// 입력스트림
		System.out.print("수심을 입력하세요 : ");	
		double depth = scan.nextDouble();		// 수심을 double형으로 입력받기
		if(depth>=10)
		System.out.printf("수온 : %.1f\n", temperature - (depth/10)*0.7);
		else
		System.out.printf("수온 : %.1f", temperature - (int)(depth/10.0)*0.7);
		/* 기본 해수면 온도에서 10m 마다 0.7도 씩 낮아지므로 입력받은 
		 * 수심(depth)를 10으로 나누어 0.7을 곱해준 후 temperature에서 뺀다. 이 상황에선 9.9m 시 예외상황이 발생
		 * 예외상황으로 수심 9.9m일 때는 기온이 떨어지지 않게 해야하므로 
		 * (depth/10.0) 값을 int형으로 캐스팅 후 0.7을 곱한 후 빼도록 만들어 준다.*/
	}

}
