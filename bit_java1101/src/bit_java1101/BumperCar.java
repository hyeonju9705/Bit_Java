package bit_java1101;

import java.util.Scanner;

public class BumperCar {

	public static void main(String[] args) {
		// ���̵��꿡�� ����ī�� ������ 125cm �̻��� ��̸� ž���� �� �ִ�.
		//������ �Է��ϸ� ž�� ���� ���θ� �˷��ִ� ���α׷� �ۼ��ϱ�
		// (��, ������ true, �Ұ����� false�� ���)
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ����(cm)�� �Է��ϼ���: ");
		int height = scan.nextInt();
		boolean dekiru=height>=125 && height<165; 
		System.out.println(dekiru); // println(height>=125)�� �ص�������
	}

}
