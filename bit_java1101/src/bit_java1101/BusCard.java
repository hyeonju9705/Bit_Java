package bit_java1101;

import java.util.Scanner;

public class BusCard {

	public static void main(String[] args) {
		// ���� 1ȸ�� ������� 1250������ ī�带 ����Ҷ����� ���Ƚ���� ����� �ܾ���
		// ����ϴ� ���α׷� ����
		// ǥ�� �Է����� �����ݾ��� �Է�
		// ���� �ݾ��� ����� ����, ��� Ƚ���� �Բ� �ܾ��� ���
		//�ܾ��� �����ϸ� ��� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �����ݾ� -->> ");
		int first = scan.nextInt();
		System.out.printf("%d���� �����Ǿ���\n", first);
		int i=0;
		while(true) {
			first = first-1250;
			i++;
			System.out.printf("%dȸ ����� �� ���� �ܾ��� %d��\n",i,first);
			if(first<1250) 
				break;
		}

	}

}
