package bit_java1110;

//Runnable �������̽��� �����Ͽ� 1�� ������ �� �ð��� ����ϴ� ������
class TimerRunnable implements Runnable{
	int n=0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000); // 1�� ���� sleep
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
