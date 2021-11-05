package bit_java1103;

class Vehicle{
	void run() { // 디폴트, package-friendly
		System.out.println("탈것이 달린다. ");
	}
}
class Bike extends Vehicle{
	public void run() { // 오버라이딩 --> 재정의, modifier가 좁아지는 방향으로 바꿀 수 없음
		System.out.println("자전거가 오버라이딩 거리며 달린다.");
	}
	void run(String sound) {
		System.out.printf("자전거가 %s 거리며 달린다. ", sound);
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.run();
	}

}
