package bit_java1110;

class AutoSaveThread extends Thread{ //������ ��°� �۾��ӵ��� �������� �ϴ� �׷��ǰ���,,,
	public void save() {
		System.out.println("�۾� ���� ����..");
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
		at.setDaemon(true);//���� ������ ������ ������ at�� �����ϴ� ��ü��
		//�Ϲ� �۾� ��������
		
		at.start();
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {}
		System.out.println("���ξ����� ����");
	}

}
