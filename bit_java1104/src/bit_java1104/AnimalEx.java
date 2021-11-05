package bit_java1104;

abstract class Animal{
	abstract public void makeSound(); // abstract메소드는 abstract class안에 있어야하며
	//makeSound()의 내용을 적을 수 없음. {}로 System.out.println("소리를낸다")이런 내용말이다.
	//추상 클래스, 추상 메소드는 반드시 앞에 abstract 키워드를 달아줘야함
	public void eat() {
		System.out.println("먹는다");
	}
}
abstract class Shape{
	//추상 메소드가 없어도, abstract class라 하면 추상 클래스임
}
abstract class Mouse extends Animal{ // 자식도 부모에게 상속받은 추상 메소드를 overriding해서
	//구현하지 않으면 추상클래스가 된다 - > 따라서 overriding하지 않을거라면 그냥 abstract붙여서 
	//자식클래스도 추상 클래스로 만들어야함
	
}
class Dog extends Animal{
	public void makeSound() { //추상메소드, abstract, 본체(구현)가 없는 메소드
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	public void makeSound() {
		System.out.println("냐옹");
	}
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Animal(); //추상 클래스의 객체 생성 불가
		
		Animal dog = new Dog(); //추상클래스의 레퍼런스 선언 가능
		dog.makeSound();
	}

}
