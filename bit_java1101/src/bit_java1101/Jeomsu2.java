package bit_java1101;

import java.util.Scanner;

public class Jeomsu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("������ �Է��Ͻÿ�-->> ");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
		case 8:
			System.out.println("�� ������");
			break;
		case 7:
		case 6:
		case 5:
			System.out.println("�� �� �����");
			break;
		default:
			System.out.println("�����б⿡ �ٽ� ������");
			break;
		}
	}

}
