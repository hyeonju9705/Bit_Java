package bit_Java1102;

import java.util.Scanner;

public class For_Yeonsan {

	private static double result;

	public static int add(int i, int j) {
		int result= i+j;
		System.out.printf("%d ���ϱ� %d�� %d\n", i,j,result);
		return result;
	}
	public static int minus(int i, int j) {
		int result= i-j;
		System.out.printf("%d ���� %d�� %d\n", i,j,result);
		return result;
	}
	public static int multi(int i, int j) {
		int result= i*j;
		System.out.printf("%d ���ϱ� %d�� %d\n", i,j,result);
		return result;
	}
	public static double divide(int i, int j) {
		result =(double)i/j;
		System.out.printf("%d ������ %d�� %f", i,j,result);
		return result;
	}
	
	public static void main(String[] args) {
		// 2���� ������ �Է� �޾� ��Ģ ������ �����ϴ� �޼ҵ� �ۼ��ϰ� �����ϴ� ���α׷� �ۼ��ϱ�
		// int add(int i, int j)
		//int minus(int i, int j) �Ҽ��� �ǹ��ִ¼��� ������
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�");
		System.out.print("ù��° ���� : ");
		int i = scan.nextInt();
		System.out.print("�ι�° ����: ");
		int j = scan.nextInt();
		add(i,j);
		minus(i,j);
		multi(i,j);
		divide(i,j);
		
		
		
		
	}

}
