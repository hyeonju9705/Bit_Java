package bit_java1101;

import java.util.Scanner;

public class LifeEx {

	public static void main(String[] args) {
		// 생존율 출력 프로그램
		// 시간 60초이내 생존율 85%
		// 120초이내 60초 초과 76%
		// 180초 이내 120초 초과 66%
		//240초 이내 180초 초과 57%
		// 300초이내 240초 초과 47%
		// 360초 초과 25%미만
		
		Scanner scan = new Scanner(System.in);
		System.out.println("최초 장비를 사용하기까지 걸린 시간을 입력하세요 -->>");
		int time = scan.nextInt();
		int life=0; 
		
		if(time<=60) {
			life = 85;
		}else if(time<=120) {
			life = 76;
		}else if(time<=180) {
			life = 66;
		} else if(time<=240) {
			life = 57;
		} else if(time<=300) {
			life = 47;
		} else {
			System.out.println("생존율 25%미만");
		}
		
		if(time<360)
		System.out.printf("생존율 : %d", life);
		//printf( ) // 생존율 출력.......
	}

}
