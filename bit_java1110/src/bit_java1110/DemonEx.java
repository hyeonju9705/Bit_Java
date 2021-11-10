package bit_java1110;

class AutoSaveThread extends Thread{ //쓰레드 라는게 작업속도를 빠랄지게 하는 그런건가봄,,,
	public void save() {
		System.out.println("작업 내용 저장..");
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
			save();
		}
	}
}
public class DemonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);//데몬 쓰레드 설정이 없으면 at가 참조하는 객체는
		//일반 작업 쓰레드임
		
		at.start();
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {}
		System.out.println("메인쓰레드 종료");
	}

}
