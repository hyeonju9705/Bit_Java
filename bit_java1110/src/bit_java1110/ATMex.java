package bit_java1110;

import java.util.Random;

class ATM{
	private int balance = 0;
	
	public ATM(int balance) {
		this.balance=balance;
	}
	public void getBalance() {
		//atm 잔액 출력
		System.out.println("현재 ATM 잔액 : "+balance);
	}
	public void deposit(int amount, String name) {
		//입금
		System.out.printf("%s 입금 금액 : %d원\n",name, amount);
		balance+=amount;
	}
	public void withdraw(int amount, String name) {
		//출금
		System.out.printf("%s 출금 금액 : %d원\n",name, amount);
		if(balance<amount) {
			System.out.println("ATM의 잔액이 부족해 출금할 수 없습니다.");
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
		Random rand=new Random(); //math.random()보다 random을 쓰는게 더 나은데
		// 그 이유는 random은 int형과 double형 둘 다 받을 수 있어서
		//사용 방법은 위 처럼 선언 해서 임포트 해주고
		//(rand.nextInt(끝 수)+시작수)*1000 해랏...
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
		ATM a =new ATM(30000); //처음에 만원으로 시작
		ATM_USER user1 =new ATM_USER(a, "미란");
		ATM_USER user2 =new ATM_USER(a, "장미");
		ATM_USER user3 =new ATM_USER(a, "코난");
		
//		user1.setPriority(10);
//		user2.setPriority(9);
//		user3.setPriority(8);
		
		user1.start();
	
		user2.start();
	
		user3.start();
		
	}

}
