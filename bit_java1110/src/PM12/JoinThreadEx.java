package PM12;

class JoinThread extends Thread{
	public JoinThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+""+i);
			try { sleep(500); } 
			catch (InterruptedException e) {}
		}
	}
}
public class JoinThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinThread t1 = new JoinThread("thread1");
		JoinThread t2 = new JoinThread("thread2");
		t1.start();
		try {
			t1.join(2000); //t1작업이 2초동안 진행되길 다른 쓰레드가 기다림
		}catch(InterruptedException e) {}
		t2.start();
	}

}
