package bit_java1103;

public class A {
	static int a =40;
	public static int add(int x, int y) {
		return this.a+y; // static �޼ҵ� �������� this Ű���� ��� �Ұ�
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println(aa.a); // ������ ���̴� static�� �ƴ� ���� ������ �� ����
		//static�ް��ִٸ� �����ھ���� ��(�Լ��� ~.���� ���������ʰ� �ܵ���밡��)
		add(1,2);
	}

}
