package bit_java1101;

import java.util.Scanner;

public class While_4Yeonsan {

	public static void main(String[] args) {
		// ���ѹݺ����� ��Ģ������ ����ϴ� ���α׷� �ۼ��ϱ�(��������, ������� �Ҽ��� ù°�ڸ�����
		//���
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է�: ");
		int one = scan.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		int two = scan.nextInt();
		System.out.print("���� ��ȣ �Է�: ");
		String yeonsan = scan.next();
		
		double result=0;
		switch(yeonsan.charAt(0)){
			case '+':
				result = one+two;
				break;
			case '-':
				result = one-two;
				break;
			case '*':
				result = one*two;
				break;
			case '/':
				result=one/two;
		}
		if(yeonsan.equals("/"))
		System.out.printf("��� ����� %.1f\n", result);
		else
			System.out.printf("��� ����� %d\n", (int)result);
		}
		
		

	}

}
