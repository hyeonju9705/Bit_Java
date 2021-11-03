package Homework;

class Account{
	int accountNo; // ���¹�ȣ
	String name; //�̸�
	double balance; //�ܾ�
	
	public void insert(int a, String n, double amnt) {
		//�������� �Է� , ���ڸ� ������ �־��� 
		this.accountNo=a;
		this.name=n;
		this.balance=amnt;
	}
	public void deposit(double amnt) {
		balance=balance+amnt; //�Ա�
		checkBalance(); // �ܾ� �����ִ� �Լ�
	}
	public void withdraw(double amnt) {
		//�ش�ݾ� ���(��ݳ��� ��� ����) �� �ܾ� ���
		//�ܾ��� ������ ��� �ܾ� ���� �޽��� ���
		
		
		if(this.balance<amnt) { //�ܾ��� �����ϴٸ�?
			System.out.println("�ܾ��� �����Ͽ� ����� �� ����!");
			checkBalance(); //�ܾ����
		} else { //�������� �ʴٸ� ���!
			balance=balance-amnt;
			checkBalance();
		}
		
		
	}
	public void checkBalance() {
		System.out.println(this.name+"���� �ܾ��� "+this.balance+"�Դϴ�.");
	}
	public void display() {
		//���� ���� ���
		System.out.println("-----------------");
		System.out.println("���¹�ȣ : "+this.accountNo+"\n������ : "+this.name+
				"\n�ܾ� : "+this.balance);
		System.out.println("-----------------");
	}
}
public class Require {

	public static void main(String[] args) {
		// checkBalance() ������ �ܾ׸� ���
		// display() ��� ���� ���..
		
		//20000�� ���
		//30000�� �Ա�
		// 1500�� ���
		Account account = new Account();
		account.insert(11111, "�ڳ�", 10000.0);
		account.display();
		account.withdraw(20000.0);
		account.deposit(30000.0);
		account.withdraw(1500.0);
		
	}

}
