package bit_java1101;

import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {
		// ���������� 80�� �̻��̸� �հ��� �Ǻ��� �ϴ� ���α׷� �ۼ��ϱ�(if�� ���)
		
		Scanner scan = new Scanner(System.in) ;
		
		int score = 0;
		System.out.print("������ �Է��Ͻÿ� -->> ");
		score = scan.nextInt();
		if(score>=80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		else
			System.out.println("���հ��Դϴ�. �� �� �����");
	}

}
