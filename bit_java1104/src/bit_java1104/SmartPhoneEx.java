package bit_java1104;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyButton btnCall = new MyButton() {
			public void click() {
				System.out.println("��ȭ��ư�� ������");
			}
		}; //��ȭ�� �͸� ���� ��ü����
		btnCall.click();
		
		MyButton btnStop = new MyButton() {
			public void click() {
				System.out.println("��ȭ�����ư�� ������");
			}
		}; //��ȭ ����� �͸� ������ü ����
		btnStop.click();
	}

}
