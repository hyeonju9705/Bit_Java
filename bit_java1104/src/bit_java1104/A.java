package bit_java1104;

abstract class Car{
	Car(){
		System.out.println("car ��ü ����");
	}
	abstract void run();
	void start() {
		System.out.println("�õ��� �Ǵ�");
	}
}
class Porche extends Car{
	void run() {
		System.out.println(" �������� �޸���");
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
