package Homework;

import java.util.Scanner;

class Account{
	String id;
	String name;
	int balance=0;
	
	public Account(String id, String name) {
		this.id=id; //생성자선언
		this.name=name;
	}
	public Account(String id, String name, int balance) {
		this.id=id; // 생성자선언
		this.name=name;
		this.balance=balance;
	}
	public String getId() {
		return id; //아이디 가져오기
	}
	public String getName() {
		return name; //이름 가져오기
	}
	public int getBalance() {
		return balance; //잔고 가져오기
	}
	public int deposit(int ammount) { //입금할 때에 입금할 양 (ammount) 입력하면
		//객체의정보를 받아와서 누가 입금하는지(getName())과 ammount로 출력해준다
		System.out.printf("%s님이 %d원을 입금하였음\n",getName(),ammount);
		return balance =balance+ammount; //그 뒤에 잔고에 입력한 금액을 더해줌
	}
	public int withdraw(int ammount) {// 출금 , 출금할 때에 얼마를 출금할건지 ammount로 입력받음
		System.out.printf("%s님이 %d원을 출금하였음\n", getName(),ammount); //이름과 얼마출금하는지출력
		return balance = balance-ammount; //잔고 = 잔고-출금금액
	}
	public int transferTo(Account another, int amount) { //송금받을 사람, 금액 입력
		
		if (amount<= balance) { //만약 송금할 금액이 잔고보다 적다면 송금 가능하므로
			System.out.printf("%s님이 %s님에게 %d원을 송금하였음\n", 
					getName(),another.name,amount); //송금하려는 사람(나)와 송금받을사람의 이름
			//여기서 주의할 점은 transferTo 메소드에서 이름으로 String값으로 입력받는게 아닌 another이라는
			//객체로 입력받기 때문에 Account에서 갖고있는 필드값의 이름으로 저장해주는 것이 좋음****
			//따라서 another.name으로 호출! 그리고 얼마 송금할건지 입력햇던 ammount보여줌
				balance = balance-amount; //송금에 성공했으므로 잔고에서 송금할 금액을 빼줌
				another.balance = another.balance + amount; //송금받은 사람의 잔고도 늘어나야하기
				//때문에 another.balance에도 amount만큼 더해줌
		}else { //송금할 금액이 전고보다 크다면 송금이 불가능 하므로
			System.out.printf("%s이 %s에게 %d원 송금 시도\n",getName(),another.name,amount);
			System.out.println("송금액이 잔액 초과!!");
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
			//입력받아서 배열에 저장하기
//			accountArr[i].id=scan.next();
//			accountArr[i].name=scan.next();
//			accountArr[i].balance=scan.nextInt();
			accountArr[i]= new Account(scan.next(), 
					scan.next(),scan.nextInt()); //이렇게 받는게 깔끔함, 매개변수 수 맞추기 중요
		}
		System.out.println("초기 계좌 정보");
		for(int i=0; i<accountArr.length; i++) {
			System.out.println(accountArr[i].toString());
		}
		System.out.println("------------------------"); //돈이 막 움직이도록 해봤음
			accountArr[0].transferTo(accountArr[1], 30000);
			accountArr[0].deposit(50000);
			accountArr[0].transferTo(accountArr[1], 30000);
			accountArr[2].withdraw(4500);
		System.out.println("------------------------");
		System.out.println("은행 업무 이후 계좌 정보");
		for(int i=0; i<accountArr.length; i++) { // 돈이 움직인 후에 어떻게 변화됐는지 보여주기
			System.out.println(accountArr[i].toString());
		}
		
	}

}
