package bit_java1101;

import java.util.Scanner;

public class JeomSu {

	public static void main(String[] args) {
		// ���� (A~F)�� �Է¹޾� ������ ���� ����ϴ� �����α׷� �ۼ��ϱ�
		// ������ A,B�� ���, "�� ������"
		// ������ C,D�� ���, "�� �� �����"
		// ������ F�� ���, "�����б⿡ �ٽ� ������"
		//���ڿ��� ���, ������ ���ϱ� ���ؼ��� equals()��� ->
		//�ڹٹ��� 5���ʹ� case�ڿ� ���� ���ǽİ� �ٷ� ������ equals()���� ��
		//���ڿ����� ù��° �ڸ��� �̾Ƴ��� �޼ҵ� -> charAt(0)
		
		Scanner scan = new Scanner (System.in);
		System.out.print("������ �Է��Ͻÿ�-->> ");
		String score = scan.next();
		
		switch(score.charAt(0)) { //string�� �����ϴ� ���ڿ��� ù��° ���ڸ� �̾Ƴ��� 
		//��ȯ�ϴ� �޼ҵ�
		case 'A':
		case 'B':
			System.out.println("�� ������");
			break;
		case 'C':
		case 'D':
			System.out.println("�� �� �����");
			break;
		default:
			System.out.println("�����б⿡ �ٽ� ������");
			break;
		}
	}

}
