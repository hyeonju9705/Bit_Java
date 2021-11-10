package PM12;

class PrintTable{
	//������ ����ϴ� ����ȭ�� �ʿ��� �޼ҵ�,synchronized
	synchronized public void printTable(int n) { //�� ���ű��� �տ� synchronized �Ѱ��� �ٿ���ٰ�
		//������� ��µǴٴ�??????
		System.out.println(n+"�� ���");
		for(int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
			try { Thread.sleep(500);}
			catch(InterruptedException e) {}
		}
	}
}

class PrintThread extends Thread{ //������ ����� ������ ������
	PrintTable pt; //�����ϴ� ��ü
	int n;
	PrintThread(PrintTable pt, int n){
		this.pt = pt;
		this.n = n;
	}
	public void run() {
		pt.printTable(n);
//		synchronized(pt) { �̷��� synchronized Ű���带 �ٿ�����!
		//�޼ҵ� ��ü���� �ɾ�ǰ� , �κ������� ���� �����ؼ� ������ ()�� �־ �ص���~
		//�ݵ�� �����ؾߵ� �κи� ��Ƽ� ����ȭ�� �ɾ��ְ�(synchronized) �ٸ��κ��� �� ������ �յ���
		//���ִ� ���� �ذ� ���� ����� ����!
//			pt.printTable(n);
//		}
	}
}
public class PrintTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable pt = new PrintTable();
		PrintThread th1 = new PrintThread(pt,2);
		PrintThread th2 = new PrintThread(pt,5);
		th1.start();
		th2.start();
	}

}
