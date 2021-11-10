package PM12;

import java.util.Random;

//동기화 = synchronized 라고 한다

class SharedCar{ //차량 공유를 위한 정보는 String 타입의 운전자 이름, 목적지임
	public synchronized void drive(String name, String destination) {
		System.out.println(name+"님이 공유차에 탔음");
		Random r = new Random();
		for(int i=0; i<r.nextInt(3)+1; i++) {
			System.out.println(name+"님이 공유차를 운전중");
			System.out.println(name+"님이 "+destination+"에 도착했음");
		}
		
	}
}
class CarThread extends Thread{
	private String driver;
	private SharedCar car; //공유객체 참조변수
	private String destination;
	public CarThread(String driver, SharedCar car, String destination) {
		this.driver = driver;
		this.car=car;
		this.destination=destination;
	}
	//쓰레드 실행시 수행할 작업을 위한 오버라이딩
	public void run() {
		car.drive(driver, destination);
	}
}
public class CarThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedCar car = new SharedCar(); //차량은 한 대만 생성
		new CarThread("코난", car, "서울").start();
		new CarThread("장미", car, "부산").start();
		new CarThread("미란", car, "대전").start();
	}

}
