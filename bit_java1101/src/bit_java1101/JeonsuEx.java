package bit_java1101;

import java.util.Scanner;

public class JeonsuEx {

	public static void main(String[] args) {
		// ����ڰ� �Է��� ���� ������ 3���� ���� ��, �Ҽ��� ù �ڸ����� �ݿø���
		// ������ ����ϴ� ���α׷� �ۼ��ϱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int su = scan.nextInt();
//		double x= (double)su/3;
//		System.out.println("��� : "+ Math.round(x));
//		math�Լ� ��� xx
		
		if(su%3>=0.5) {
			System.out.println("��� : "+(su/3+1));
		}
	}

}
