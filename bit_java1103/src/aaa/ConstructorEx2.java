package aaa;

class A{
	public A() {
		System.out.println("A��ü ����");
	}
	public A(int x) {
		System.out.println("�Ű����� �ִ� ������ A��ü ����");
	}
}

class B extends A {
	public B() {
		System.out.println("B��ü ����");
	}
	public B(int y) { // super();�� �����Ǿ������� super();�� ������ �θ��� ¦�� ã������ ��
		//�⺻ �����ڸ� ȣ���ϰԵǾ��ִ� �׷��� �Ű����� �ִ� �����ڸ� ȣ���ϰ�ʹٸ�
		super(y); //�̷��� ���� ���ڸ� �־ super������ �ϸ� ������.
		
		System.out.println("�Ű����� �ִ� ������ B��ü ����");
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b;
		b = new B(36);
	}

}
