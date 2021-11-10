package bit_java1110;

import java.util.Random;

class ATM{
	private int balance = 0;
	
	public ATM(int balance) {
		this.balance=balance;
	}
	public void getBalance() {
		//atm �ܾ� ���
		System.out.println("���� ATM �ܾ� : "+balance);
	}
	public void deposit(int amount, String name) {
		//�Ա�
		System.out.printf("%s �Ա� �ݾ� : %d��\n",name, amount);
		balance+=amount;
	}
	public void withdraw(int amount, String name) {
		//���
		System.out.printf("%s ��� �ݾ� : %d��\n",name, amount);
		if(balance<amount) {
			System.out.println("ATM�� �ܾ��� ������ ����� �� �����ϴ�.");
		}else
			balance-=amount;
		
	}
}
class ATM_USER extends Thread{
	ATM atm;
	
	public ATM_USER(ATM atm, String name) {
		super(name);
		this.atm=atm;
	}
	public void run() {
		Random rand=new Random(); //math.random()���� random�� ���°� �� ������
		// �� ������ random�� int���� double�� �� �� ���� �� �־
		//��� ����� �� ó�� ���� �ؼ� ����Ʈ ���ְ�
		//(rand.nextInt(�� ��)+���ۼ�)*1000 �ض�...
		for(int i=0; i<10; i++) {
		atm.withdraw((rand.nextInt(20)+1)*1000,Thread.currentThread().getName());
		atm.getBalance();
		atm.deposit((rand.nextInt(20)+1)*1000,Thread.currentThread().getName());
		}
	}
}
public class ATMex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a =new ATM(30000); //ó���� �������� ����
		ATM_USER user1 =new ATM_USER(a, "�̶�");
		ATM_USER user2 =new ATM_USER(a, "���");
		ATM_USER user3 =new ATM_USER(a, "�ڳ�");
		
//		user1.setPriority(10);
//		user2.setPriority(9);
//		user3.setPriority(8);
		
		user1.start();
	
		user2.start();
	
		user3.start();
		
	}

}
