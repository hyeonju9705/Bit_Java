package bit_java1101;

import java.util.Scanner;

public class TemperatureEx {

	public static void main(String[] args) {
		// ����� �µ��� �����Ͽ� ���� �ڵ����� �����Ϸ��� ��ġ�� ��������Ѵ�
		// ������ �䱸������ �����ϴ� ���α׷� �ۼ��ϱ�
		//��� �µ��� �Է�
		//��� �µ��� 40�̻��̸� �Ұ��� ���
		//��� �µ��� 40�̸��̸� �� ������ ���
		
		Scanner scan =new Scanner(System.in);
		System.out.print("����� �µ��� �Է��ϼ���: ");
		double temperature = scan.nextDouble(); 
		//next���� Ÿ�� �ȸ����ָ� inputMissmatch
		if(temperature>=40.0)
			System.out.println("��(Fan) ����");
		else
			System.out.println("��(Fan) ����");

	}

}
