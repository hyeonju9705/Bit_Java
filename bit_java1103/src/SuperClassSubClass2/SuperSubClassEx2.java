package SuperClassSubClass2;


public class SuperSubClassEx2{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.p =5;
		b.p =5;
		
		//setter�� ȣ���Ͽ� n���� 10���� ����
		b.setN(10);
		int i = b.getN(); //10
		
		//setter�� ȣ���Ͽ� n���� 20���� ����
		b.setM(20);
		System.out.println(b.toString());
	}
}

