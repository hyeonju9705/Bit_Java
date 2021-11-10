package bit_java1110;

class PriorityThread extends Thread{
	public PriorityThread (String name) {
		super(name); //������ ������ �̸��� �����ϱ����� �Ű����� ������ ����
	}
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+"��°");
			System.out.print("�������� ������ �̸� : "+Thread.currentThread().getName());
			System.out.println("---> ������ �켱 ���� : "+Thread.currentThread().getPriority());
		}
	}
}
public class PriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread p1 = new PriorityThread("����");
		PriorityThread p2 = new PriorityThread("�߰���");
		PriorityThread p3 = new PriorityThread("����");
		p1.setPriority(Thread.MAX_PRIORITY); //�켱������ ���ڰ� �������� �켱������ ���� ��
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p1.start(); //p1�� �� �������� p2����Ǵ°� �ƴ����� ��ü�� �׷� ����(?)
		p2.start(); //�켱���� ���ڰ� ���� ���̰� �ȳ��� ���� �� ���ÿ� ����Ǵ°���..
		p3.start();
	}

}
