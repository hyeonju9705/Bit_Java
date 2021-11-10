package bit_java1110;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);//sleep은 현재 실행중인 Thread를 일시 정지시켜 not runnable상태로
				
				System.out.println(i+"번 : 작업쓰레드");
			}catch(InterruptedException e) {
				return; //예외처리문
			}
		}
	}
}
public class MainThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start(); //하나의 쓰레드씩 실행되는것,,,, start를 꼭 해주는게 중요
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+"번 : main 쓰레드");
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
