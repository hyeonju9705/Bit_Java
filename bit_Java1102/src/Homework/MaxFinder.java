package Homework;

import java.util.Scanner;

public class MaxFinder {

	public static void main(String[] args) {
		// ���� 5�� �Է¹޾� �迭�� ����
		// ����ū �� ȭ�鿡 ���
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		int max=0;
		
		for(int i=0; i<numbers.length; i++) {
			int num=scan.nextInt();
			numbers[i]=num;
			if(max<num)
				max=num;
		}
		System.out.println("���� ū ���� "+max);
	}

}
