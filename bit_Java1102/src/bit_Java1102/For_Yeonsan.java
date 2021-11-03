package bit_Java1102;

import java.util.Scanner;

public class For_Yeonsan {

	private static double result;

	public static int add(int i, int j) {
		int result= i+j;
		System.out.printf("%d 더하기 %d은 %d\n", i,j,result);
		return result;
	}
	public static int minus(int i, int j) {
		int result= i-j;
		System.out.printf("%d 빼기 %d은 %d\n", i,j,result);
		return result;
	}
	public static int multi(int i, int j) {
		int result= i*j;
		System.out.printf("%d 곱하기 %d은 %d\n", i,j,result);
		return result;
	}
	public static double divide(int i, int j) {
		result =(double)i/j;
		System.out.printf("%d 나누기 %d은 %f", i,j,result);
		return result;
	}
	
	public static void main(String[] args) {
		// 2개의 정수를 입력 받아 사칙 연산을 수행하는 메소드 작성하고 실행하는 프로그램 작성하기
		// int add(int i, int j)
		//int minus(int i, int j) 소숫점 의미있는숫자 나오게
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하시오");
		System.out.print("첫번째 정수 : ");
		int i = scan.nextInt();
		System.out.print("두번째 정수: ");
		int j = scan.nextInt();
		add(i,j);
		minus(i,j);
		multi(i,j);
		divide(i,j);
		
		
		
		
	}

}
