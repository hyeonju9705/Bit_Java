package bit_Java1102;

import java.util.Scanner;

public class AvgEx {

	public static void main(String[] args) {
		// Ű���忡�� ������ �Է¹ް� ����� ���ϴ� ���α׷� �ۼ��ϱ�
		Scanner scan = new Scanner(System.in);
		int[] numbers= new int [5];
		int sum=0;
		
		for(int i =0; i<5; i++) {
			int num = scan.nextInt();
			numbers[i]=num;
			sum+=numbers[i];
		}
		double avg=sum/5;
		System.out.println("�迭 ������ ����� "+avg);
	}

}
