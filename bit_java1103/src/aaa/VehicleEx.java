package aaa;

class Vehicle{
	void run() { // ����Ʈ, package-friendly
		System.out.println("Ż���� �޸���. ");
	}
}
class Bike extends Vehicle{
	void run() { // �������̵� --> ������, modifier�� �������� �������� �ٲ� �� ����
		System.out.println("�����Ű� ������ �Ÿ��� �޸���.");
	}
	void stop() {
		System.out.println("�����Ÿ� �����. ");
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike(); // b= bike
		b.run(); //�����Ű� ������ �Ÿ��� �޸���.
		
		Vehicle v = new Bike(); // v=bike // v�� bike�� �����Ѵٴ� ��
		v.run(); //�����Ű� ������ �Ÿ��� �޸���.
		//v.stop(); //�־ȵ���,,,,,,,,,�� vehicle�� ���Ǹ� �϶������???? v�� bike�ε�..?
	}	//���ؿϷ� - 23��°�� : 
	//v�� �θ��ε� v��� �ְ� �ᱹ Vehicle(�θ�)���� bike�� �����ϰ� �Ѱ���
	// �׷��� 24��°�� �� run�޼ҵ带 ���� vehicle�� �����ִ� �޼ҵ�� ������ (�ٵ� �ڽ� ��ü����
	// �������̵��� �ؼ� �������̵��� �ְ� ��µǴ°� ******
	// 25��°���� v�� �ᱹ �θ��� Vehicle�̴ϱ� stop�޼ҵ尡 ��� �����߻��ϴ°���

}

