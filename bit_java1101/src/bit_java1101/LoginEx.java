package bit_java1101;

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		// ȸ�� ��� �� ����� ���̵�� �н������ ���� conan�� 1111��
		//�ҽ��ڵ� ���ο� ������ ������ �����Ͽ� ���ǽĿ� ����� ��
		//���α׷��� ����Ǹ� ����ڰ� �Է��� ���̵�� �н����带 �Է�
		//��ϵ� ���̵�� �н������ ���� ���� ���ǿ� ���� �α��� ���� �Ǵ� �α���
		//���и� ������ ���� �޽����� ����ϱ�
		// ���ڿ��� ������ ���ϴµ� ����ϴ� �޼ҵ�� equals()��
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ���̵� �Է�: ");
		String id = scan.next();
		System.out.print("������� �н����� �Է�: ");
		String pw = scan.next();
		if(id.equals("conan")) {
			if(pw.equals("1111")) {
				System.out.println("�α��ο� �����ϼ̽��ϴ�.");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("��ϵ� ����ڰ� �ƴմϴ�. ȸ�� ������ Ȯ���ϼ���");
		}

	}

}
