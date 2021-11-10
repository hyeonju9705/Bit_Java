package PM12;

class TimerThread extends Thread{
	int n=0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try {Thread.sleep(100);} // 0.1�� ���� sleep
			catch(InterruptedException e) { return; }
		}
	}
}
public class TimerThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerThread th = new TimerThread();
		th.start();
		try {
			Thread.sleep(10000); // 10�ʵ��� sleep
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt(); //������ ���� 10�� �Ŀ� ����
	}

}
