package Homework;

import java.util.Scanner;

class Account{
	String id;
	String name;
	int balance=0;
	
	public Account(String id, String name) {
		this.id=id; //�����ڼ���
		this.name=name;
	}
	public Account(String id, String name, int balance) {
		this.id=id; // �����ڼ���
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return id; //���̵� ��������
	}
	public String getName() {
		return name; //�̸� ��������
	}
	public int getBalance() {
		return balance; //�ܰ� ��������
	}
	public int deposit(int ammount) { //�Ա��� ���� �Ա��� �� (ammount) �Է��ϸ�
		//��ü�������� �޾ƿͼ� ���� �Ա��ϴ���(getName())�� ammount�� ������ش�
		System.out.printf("%s���� %d���� �Ա��Ͽ���\n",getName(),ammount);
		return balance =balance+ammount; //�� �ڿ� �ܰ� �Է��� �ݾ��� ������
	}
	public int withdraw(int ammount) {// ��� , ����� ���� �󸶸� ����Ұ��� ammount�� �Է¹���
		System.out.printf("%s���� %d���� ����Ͽ���\n", getName(),ammount); //�̸��� ������ϴ������
		return balance = balance-ammount; //�ܰ� = �ܰ�-��ݱݾ�
	}
	public int transferTo(Account another, int amount) { //�۱ݹ��� ���, �ݾ� �Է�
		
		if (amount<= balance) { //���� �۱��� �ݾ��� �ܰ��� ���ٸ� �۱� �����ϹǷ�
			System.out.printf("%s���� %s�Կ��� %d���� �۱��Ͽ���\n", 
					getName(),another.name,amount); //�۱��Ϸ��� ���(��)�� �۱ݹ�������� �̸�
			//���⼭ ������ ���� transferTo �޼ҵ忡�� �̸����� String������ �Է¹޴°� �ƴ� another�̶��
			//��ü�� �Է¹ޱ� ������ Account���� �����ִ� �ʵ尪�� �̸����� �������ִ� ���� ����****
			//���� another.name���� ȣ��! �׸��� �� �۱��Ұ��� �Է��޴� ammount������
				balance = balance-amount; //�۱ݿ� ���������Ƿ� �ܰ��� �۱��� �ݾ��� ����
				another.balance = another.balance + amount; //�۱ݹ��� ����� �ܰ� �þ���ϱ�
				//������ another.balance���� amount��ŭ ������
		}else { //�۱��� �ݾ��� ������ ũ�ٸ� �۱��� �Ұ��� �ϹǷ�
			System.out.printf("%s�� %s���� %d�� �۱� �õ�\n",getName(),another.name,amount);
			System.out.println("�۱ݾ��� �ܾ� �ʰ�!!");
		}
		return balance;
	}
	public String toString() {
		return String.format("Account[id=%s, name=%s, balance=%d]",
				this.getId(),this.getName(),this.getBalance());
	}
}
public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Account account = new Account(null,null);
		
		Account[] accountArr = new Account[3];
		for(int i=0; i<accountArr.length; i++) {
			//�Է¹޾Ƽ� �迭�� �����ϱ�
//			accountArr[i].id=scan.next();
//			accountArr[i].name=scan.next();
//			accountArr[i].balance=scan.nextInt();
			accountArr[i]= new Account(scan.next(), 
					scan.next(),scan.nextInt()); //�̷��� �޴°� �����, �Ű����� �� ���߱� �߿�
		}
		System.out.println("�ʱ� ���� ����");
		for(int i=0; i<accountArr.length; i++) {
			System.out.println(accountArr[i].toString());
		}
		System.out.println("------------------------"); //���� �� �����̵��� �غ���
			accountArr[0].transferTo(accountArr[1], 30000);
			accountArr[0].deposit(50000);
			accountArr[0].transferTo(accountArr[1], 30000);
			accountArr[2].withdraw(4500);
		System.out.println("------------------------");
		System.out.println("���� ���� ���� ���� ����");
		for(int i=0; i<accountArr.length; i++) { // ���� ������ �Ŀ� ��� ��ȭ�ƴ��� �����ֱ�
			System.out.println(accountArr[i].toString());
		}
		
	}

}
