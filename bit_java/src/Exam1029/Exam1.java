package Exam1029;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// Ű����� �Է¹��� ������ �ð������� �ʿ� �ش��ϰ�, �� �ð��� �� �ð�, �� ��,
		//�� �ʿ� �ش��ϴ��� ����� ���� ���ÿ� ���� ����ϴ� ���α׷� �ۼ��ϱ�
		//���� ���, ���� 5000�� �Է¹��� ��� 5000�ʿ� �ش��ϰ�, �̴� 1�ð� 23�� 20���̸�
		//24�ð��� �Ѿ�� ���� �߻����� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ð��� �ʴ����� �Է��ϼ��� : ");
		int x= scan.nextInt();
		if(x>= 86400) 
			return;
		
		int time= x/3600;
		int minute= (x%3600)/60;
		int cho = x%60;
		
		System.out.printf("%d�ʴ� %d�ð� %d�� %d���Դϴ�",x,time,minute,cho );
		
		
		
	}

}
