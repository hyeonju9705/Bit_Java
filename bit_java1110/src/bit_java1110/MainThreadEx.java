package bit_java1110;

class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);//sleep�� ���� �������� Thread�� �Ͻ� �������� not runnable���·�
				
				System.out.println(i+"�� : �۾�������");
			}catch(InterruptedException e) {
				return; //����ó����
			}
		}
	}
}
public class MainThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start(); //�ϳ��� �����徿 ����Ǵ°�,,,, start�� �� ���ִ°� �߿�
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i+"�� : main ������");
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
