package bit_java1101;

import java.util.Scanner;

public class BirthYearEx {

	public static void main(String[] args) {
		// �������(birthYear)�� �Է��ϸ� ���� �䱸���׿� ���� ����ũ ����
		// ������ ������ ����ϴ� ���α׷� �ۼ��ϱ�
		//���� ����ũ �Ǹ� �����ؼ� ��� ���� ���ڸ��� �̿��� 5���� �ǽ�
		//�� 65�̻� ����� �������� ���Ű���
		// 1,6 �̸� �� 2,7 ȭ 3,8 �� 4,9 ��
		//��ø if�� ���
		Scanner scan = new Scanner (System.in);
		System.out.print("����⵵�� �Է��ϼ��� -->> ");
		int birthYear = scan.nextInt();
		if(birthYear<=1956)
			System.out.println("�������� ���� �����մϴ�.");
		else {
		int x=birthYear%10; // ���ڸ��� ���ϴ°�
		String yoil;
		if(x ==0 | x==5) {
			yoil="��";
		} else if(x == 4 | x ==9) {
			yoil = "��";
		} else if(x==3 | x==8) {
			yoil = "��";
		} else if( x==2 | x==7) {
			yoil="ȭ";
		} else
			yoil="��";
		
		System.out.print(yoil+"���Ͽ� ���Ű����մϴ�.");
		}
	}

}
