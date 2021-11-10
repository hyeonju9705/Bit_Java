package bit_java1110;

class ManyThread extends Thread{
	public ManyThread(String str) {
		super(str);
	}
	public void run() {
		for(int i=0; i<10; i++) {
			//���� �۾����� thread�� this�� ����
			System.out.println(i+" "+getName());
			try { //���ð��� �������� ����
				Thread.sleep((long)(Math.random()*1000));
			}catch (InterruptedException e) {}
		}
		System.out.println("�۾� �Ϸ�! "+getName());
	}
}
public class ManyThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ManyThread("Thread1").start(); //�Ȱ��� thread�� �ι� start�� ���� ����
		new ManyThread("Thread2").start();
	}

}
