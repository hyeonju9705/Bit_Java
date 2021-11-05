package aaa;

class Vehicle{
	void run() { // 디폴트, package-friendly
		System.out.println("탈것이 달린다. ");
	}
}
class Bike extends Vehicle{
	void run() { // 오버라이딩 --> 재정의, modifier가 좁아지는 방향으로 바꿀 수 없음
		System.out.println("자전거가 따르릉 거리며 달린다.");
	}
	void stop() {
		System.out.println("자전거를 멈춘다. ");
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike(); // b= bike
		b.run(); //자전거가 따르릉 거리며 달린다.
		
		Vehicle v = new Bike(); // v=bike // v가 bike를 참조한다는 뜻
		v.run(); //자전거가 따르릉 거리며 달린다.
		//v.stop(); //왜안돼지,,,,,,,,,왜 vehicle에 정의를 하라고하지???? v는 bike인뎅..?
	}	//이해완료 - 23번째줄 : 
	//v가 부모인데 v라는 애가 결국 Vehicle(부모)여서 bike를 참조하게 한거임
	// 그런데 24번째줄 에 run메소드를 보면 vehicle이 갖고있는 메소드라 ㅇㅋ임 (근데 자식 객체에서
	// 오버라이딩을 해서 오버라이딩된 애가 출력되는것 ******
	// 25번째줄은 v가 결국 부모인 Vehicle이니까 stop메소드가 없어서 오류발생하는것임

}

