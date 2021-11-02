package Exam1029;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 키보드로 입력받은 정수는 시간단위의 초에 해당하고, 그 시간이 몇 시간, 몇 분,
		//몇 초에 해당하는지 계산한 다음 예시와 같이 출력하는 프로그램 작성하기
		//예를 들어, 정수 5000을 입력받은 경우 5000초에 해당하고, 이는 1시간 23분 20초이며
		//24시간을 넘어가는 경우는 발생하지 않음
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시간을 초단위로 입력하세요 : ");
		int x= scan.nextInt();
		if(x>= 86400) 
			return;
		
		int time= x/3600;
		int minute= (x%3600)/60;
		int cho = x%60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다",x,time,minute,cho );
		
		
		
	}

}
