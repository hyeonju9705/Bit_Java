package bit_java1101;

import java.util.Scanner;

public class SeaDeepEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.print("������ �Է��ϼ���: ");
//		int Deep= scan.nextInt();
//		
//		int level=(Deep/10);
//		double depth = 20-(level*0.7);
//		if(Deep<10) {
//		System.out.println("���� : 20");
//		} else {
//			System.out.println("���� : "+depth);
//		} //���� ���Ŵ� 9.9�϶��� ������ ��������
		
//		20
//		19.3
//		18.6
//		17.9    10m�� ������������ 0.7�� ��������..... 
		
		//�п� ���ϴ¾� �� ��
		double temperature = 20.0;		// �⺻ �ؼ��� �µ� 20��
		Scanner scan = new Scanner(System.in);	// �Է½�Ʈ��
		System.out.print("������ �Է��ϼ��� : ");	
		double depth = scan.nextDouble();		// ������ double������ �Է¹ޱ�
		if(depth>=10)
		System.out.printf("���� : %.1f\n", temperature - (depth/10)*0.7);
		else
		System.out.printf("���� : %.1f", temperature - (int)(depth/10.0)*0.7);
		/* �⺻ �ؼ��� �µ����� 10m ���� 0.7�� �� �������Ƿ� �Է¹��� 
		 * ����(depth)�� 10���� ������ 0.7�� ������ �� temperature���� ����. �� ��Ȳ���� 9.9m �� ���ܻ�Ȳ�� �߻�
		 * ���ܻ�Ȳ���� ���� 9.9m�� ���� ����� �������� �ʰ� �ؾ��ϹǷ� 
		 * (depth/10.0) ���� int������ ĳ���� �� 0.7�� ���� �� ������ ����� �ش�.*/
	}

}
