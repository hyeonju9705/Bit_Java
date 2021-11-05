package SuperClassSubClass2;


public class SuperSubClassEx2{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.p =5;
		b.p =5;
		
		//setter을 호출하여 n값을 10으로 변경
		b.setN(10);
		int i = b.getN(); //10
		
		//setter을 호출하여 n값을 20으로 변경
		b.setM(20);
		System.out.println(b.toString());
	}
}

