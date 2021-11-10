package bit_java1110;

//Runnable 인터페이스를 구현하여 1초 단위로 초 시간을 출력하는 쓰레드
class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000); // 1초 동안 sleep
			} catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		Thread tr = new Thread(new TimerRunnable());
		tr.start();
	}

}
