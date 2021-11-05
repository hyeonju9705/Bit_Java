package bit_java1104;

abstract class Car{
	Car(){
		System.out.println("car 객체 생성");
	}
	abstract void run();
	void start() {
		System.out.println("시동을 건다");
	}
}
class Porche extends Car{
	void run() {
		System.out.println(" 포르쉐가 달린다");
	}
}
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Porche();
		car.start();
		car.run();
	}

}
