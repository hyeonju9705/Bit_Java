package bit_Java1102;

import java.util.Scanner;

public class AvgEx {

	public static void main(String[] args) {
		// 키보드에서 정수를 입력받고 평균을 구하는 프로그램 작성하기
		Scanner scan = new Scanner(System.in);
		int[] numbers= new int [5];
		int sum=0;
		
		for(int i =0; i<5; i++) {
			int num = scan.nextInt();
			numbers[i]=num;
			sum+=numbers[i];
		}
		double avg=sum/5;
		System.out.println("배열 원소의 평균은 "+avg);
	}

}
