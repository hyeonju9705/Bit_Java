package bit_java1101;

public class Nonli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a'>'b');//char, false
		System.out.println("a"=="b"); // �������� ����� ����
		System.out.println("a">"b"); //�������� ũ�� �� �Ұ�
		System.out.println(true>false);
		System.out.println((3<=5)&& (1<0)); //���������� ��ġ�ϴ°�,
		//��й�ȣ�� ��ġ�ϴ°�
		System.out.println((3==5))
		
		int x=1; int y=2;
		int s =(x>y) ? 1: -1; // ���� x>y�� ���̸� ����� 1, �����̸� -1
		System.out.println(s);
		s = !(x>y) ? 1: -1;
		System.out.println(s);
	}

}
