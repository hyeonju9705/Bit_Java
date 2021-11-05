package bit_java1104;

import java.util.Scanner;

public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try{
			System.out.print("나뉨수를 입력하시오: ");
			int x=scan.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			int y=scan.nextInt();
			int result = x/y;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
