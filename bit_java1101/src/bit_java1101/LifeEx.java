package bit_java1101;

import java.util.Scanner;

public class LifeEx {

	public static void main(String[] args) {
		// ������ ��� ���α׷�
		// �ð� 60���̳� ������ 85%
		// 120���̳� 60�� �ʰ� 76%
		// 180�� �̳� 120�� �ʰ� 66%
		//240�� �̳� 180�� �ʰ� 57%
		// 300���̳� 240�� �ʰ� 47%
		// 360�� �ʰ� 25%�̸�
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ��� ����ϱ���� �ɸ� �ð��� �Է��ϼ��� -->>");
		int time = scan.nextInt();
		int life=0; 
		
		if(time<=60) {
			life = 85;
		}else if(time<=120) {
			life = 76;
		}else if(time<=180) {
			life = 66;
		} else if(time<=240) {
			life = 57;
		} else if(time<=300) {
			life = 47;
		} else {
			System.out.println("������ 25%�̸�");
		}
		
		if(time<360)
		System.out.printf("������ : %d", life);
		//printf( ) // ������ ���.......
	}

}
