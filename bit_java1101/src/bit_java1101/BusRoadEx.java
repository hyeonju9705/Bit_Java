package bit_java1101;

import java.util.Scanner;

public class BusRoadEx {

	public static void main(String[] args) {
		// ���� �������� �ܼ� ���α׷�
		// ���� �������ο� ������ �ƴ� ������ ������ ��� �ܼ�
		// �� ����� �� �������� �ܼ��� ���� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.��~�� 2.����� 3.������");
		System.out.print("������ �����ϼ���(1~3) -->");
		int yoil=scan.nextInt();
		
		if(yoil==1) {
			System.out.println("���� �������� �ܼ����Դϴ�.");
			
			System.out.print("������ �����ϼ���(1,2)--> ");
			int car = scan.nextInt();
			
			if(car==1)
				System.out.println("������");
			else
				System.out.println("���� �������� ����!!");
		} else 
			System.out.println("�����, �������� �ܼ����� �ʾƿ�~");
		
		
		
	}

}
