package Homework;

import java.util.Scanner;
//���Ͼ���� ���� �ʼ�,,,,

class Student{
	public String name; //�л��̸�
	public int ban; //��
	public int no; //��ȣ
	public int kor; //��������
	public int eng; //�������� 
	public int math; //��������
	
	
	public int getTotal() {
		return this.kor+this.eng+this.math; //����
	}
	public double getAverage() {
		return Math.round((getTotal()/3.0)*100)/100.0; //�Ҽ��� ���ڰ� �����ٷ��� �Ѱ�
	}
	public void showInfo() {
		System.out.println(this.name +" "+this.ban+" "+this.no+" "+this.kor+" "
				+this.eng+" "+
				this.math+" "+
				this.getTotal()+" "+this.getAverage()); //������ �� ������ִ� �Լ�
	}
}
public class StudentEx {

	public static void main(String[] args) {
		// ������ ������ �� �ִ� �迭 �����(student ��ü����)
		//�Է� �ѹ� ����ѹ�,,,,(�ݺ���)
		// showInfo()�� ȣ���ϸ� �Ҷ�� ���� �� �ֵ���
		//�ݵ�� �迭 �̿��ϱ�
		Scanner scan = new Scanner(System.in);
		
		
		
		Student[] stdArr = new Student[3]; //�迭 ����
		for(int i=0; i<3; i++) {
			stdArr[i] = new Student(); //������ ����
			System.out.println("�л������� �̸�, ��, ��ȣ, ����, ����, ����, ������� "
					+ "�Է��ϼ��� -->>");
			stdArr[i].name = scan.next(); //������ �Է¹���. �޾Ƽ� �������� name�� ����
			stdArr[i].ban = scan.nextInt();
			stdArr[i].no = scan.nextInt();
			stdArr[i].kor = scan.nextInt();
			stdArr[i].eng = scan.nextInt();
			stdArr[i].math = scan.nextInt();
		}
		
		System.out.println("-----------------------------------");
		System.out.println("�л��̸� �� ��ȣ ���� ���� ���� ���� ���");
		for(int i = 0; i< stdArr.length; i++) // ������ ���� �迭�� ���������ν� ��� �迭�ǰ���
			stdArr[i].showInfo(); //���
	}

}


