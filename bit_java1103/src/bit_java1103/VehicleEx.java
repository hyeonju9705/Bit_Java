package bit_java1103;

class Vehicle{
	void run() { // ����Ʈ, package-friendly
		System.out.println("Ż���� �޸���. ");
	}
}
class Bike extends Vehicle{
	public void run() { // �������̵� --> ������, modifier�� �������� �������� �ٲ� �� ����
		System.out.println("�����Ű� �������̵� �Ÿ��� �޸���.");
	}
	void run(String sound) {
		System.out.printf("�����Ű� %s �Ÿ��� �޸���. ", sound);
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();
	}

}
