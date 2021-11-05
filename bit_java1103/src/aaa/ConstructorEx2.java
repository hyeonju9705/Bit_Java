package aaa;

class A{
	public A() {
		System.out.println("A객체 생성");
	}
	public A(int x) {
		System.out.println("매개변수 있는 생성자 A객체 생성");
	}
}

class B extends A {
	public B() {
		System.out.println("B객체 생성");
	}
	public B(int y) { // super();가 생략되어있으며 super();은 무조건 부모의 짝을 찾으러갈 때
		//기본 생성자를 호출하게되어있다 그래서 매개변수 있는 생성자를 호출하고싶다면
		super(y); //이렇게 직접 인자를 넣어서 super선언을 하면 가능함.
		
		System.out.println("매개변수 있는 생성자 B객체 생성");
	}
}
public class ConstructorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b;
		b = new B(36);
	}

}
