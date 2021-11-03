package Homework;

class Account{
	int accountNo; // 계좌번호
	String name; //이름
	double balance; //잔액
	
	public void insert(int a, String n, double amnt) {
		//계좌정보 입력 , 인자를 변수에 넣어줌 
		this.accountNo=a;
		this.name=n;
		this.balance=amnt;
	}
	public void deposit(double amnt) {
		balance=balance+amnt; //입금
		checkBalance(); // 잔액 보여주는 함수
	}
	public void withdraw(double amnt) {
		//해당금액 출금(출금내역 출력 포함) 후 잔액 출력
		//잔액이 부족한 경우 잔액 부족 메시지 출력
		
		
		if(this.balance<amnt) { //잔액이 부족하다면?
			System.out.println("잔액이 부족하여 출금할 수 없음!");
			checkBalance(); //잔액출력
		} else { //부족하지 않다면 출금!
			balance=balance-amnt;
			checkBalance();
		}
		
		
	}
	public void checkBalance() {
		System.out.println(this.name+"님의 잔액은 "+this.balance+"입니다.");
	}
	public void display() {
		//계좌 정보 출력
		System.out.println("-----------------");
		System.out.println("계좌번호 : "+this.accountNo+"\n예금주 : "+this.name+
				"\n잔액 : "+this.balance);
		System.out.println("-----------------");
	}
}
public class Require {

	public static void main(String[] args) {
		// checkBalance() 현재의 잔액만 출력
		// display() 모든 정보 출력..
		
		//20000원 출금
		//30000원 입금
		// 1500원 출금
		Account account = new Account();
		account.insert(11111, "코난", 10000.0);
		account.display();
		account.withdraw(20000.0);
		account.deposit(30000.0);
		account.withdraw(1500.0);
		
	}

}
