package Homework;

import java.util.Scanner;

public class MaxFinder {

	public static void main(String[] args) {
		// 정수 5개 입력받아 배열에 저장
		// 제일큰 수 화면에 출력
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		int max=0;
		
		for(int i=0; i<numbers.length; i++) {
			int num=scan.nextInt();
			numbers[i]=num;
			if(max<num)
				max=num;
		}
		System.out.println("가장 큰 수는 "+max);
	}

}
