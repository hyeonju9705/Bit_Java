package bit_java1101;

import java.util.Scanner;

public class ElectronicEx {

	public static void main(String[] args) {
		// ������ ��� ���α׷�
		// ���⸦ ���� ����ϸ� �������� ����Ǿ� �ܰ��� �⺻����� ����Ѵ�
		// ������ �ܰ�ǥ�� �����Ͽ� ���� ��뷮�� �Է��ϸ� ����ᰡ ��µǴ� ���α׷��ۼ�
		// �⺻���+(��뷮*�ܰ�) if���ǹ� ���
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.print("���� ��뷮�� �Է��ϼ��� --> ");
		double yang = scan.nextDouble();
		double y,z; //�⺻���,�ܰ�
		
		if(yang<=200) {
			y=910; z=99.3;
		}else if(yang<=400) {
			y= 1600; z= 187.9;
		}	
		else
			y= 7300; z= 280.6;
			
		double money = yang+(y*z); //������
		System.out.printf("��뷮: %5.1f km/h\n",yang);
		System.out.printf("�⺻ ��� : %5.1f��\n", y);
		System.out.printf("�ܰ� : %5.1f��\n", z);
		System.out.printf("���� ��� : %6.1f ��", money);

	}

}
