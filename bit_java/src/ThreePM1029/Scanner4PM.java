package ThreePM1029;

import java.util.Scanner;

public class Scanner4PM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //��ĳ�� Ÿ���� ��ü�� �����ϴ� ���� scan
		
		//�̸� (String), �ּ�(String), ����(int), Ű(double)�� Ű���忡�� �Է¹������� ��
		System.out.print("����� �̸��� �Է��ϼ��� ->");
		String name = scan.next(); //�̸�
		System.out.print("����� �ּҸ� �Է��ϼ��� ->");
		String addr = scan.next(); //�ּ�
		System.out.print("����� ���̸� �Է��ϼ��� ->");
		int age =scan.nextInt(); //����
		System.out.print("����� Ű(cm)�� �Է��ϼ��� ->");
		double height = scan.nextDouble(); //Ű
		System.out.println(name+" "+addr+" "+age+" "+height);
		System.out.printf("�̸�: %s\n �ּ�: %s\n ����: %d\n Ű: %f\n", 
				name,addr,age,height);
	}
}
