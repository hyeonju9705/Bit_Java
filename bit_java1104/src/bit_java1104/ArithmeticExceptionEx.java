package bit_java1104;

import java.util.Scanner;

public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.print("�������� �Է��Ͻÿ�: ");
			int x=scan.nextInt();
			System.out.print("�������� �Է��Ͻÿ�: ");
			int y=scan.nextInt();
			int result = x/y;
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
