package Exam;

import java.util.Scanner; //왜케어려워진짜 오후 4:11기준 역대급

class Customer{
	private int id; //고객 아이디는 1~3
	private String name; 
	private int discount;
	
	public Customer(int id, String name, int discount){
		this.id=id;
		this.name=name;
		this.discount = discount;
		}
	public int getId() {
		return id;
	}
	public  String getName() {
		return this.name;
	}
	public int getDiscount() {
		return this.discount;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public String toString() {
		return String.format("%s(%d)", name, id);
	}
}
class Invoice{
	private int id;
	private Customer customer; // customer 클래스의 내용을 갖고잇는거임!!
	private double amount;
	
	public Invoice(int id, Customer customer, double amount) {
		this.id=id; //상품아이디
		this.customer=customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return this.customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCustomerName() {
		return customer.getName(); //고객의 이름 정보는 customer가 참조하니까
	}
	public double getAmountAfterDiscount() {
		return amount-(amount*customer.getDiscount())/100; 
		//잔고 - 할인율 가져와서 할인 = 할인 받은 최종금액
		
	}
}
public class CustomerEx {

	public static void main(String[] args) {
		// 최종지불액은 할인된금액
		// getAmountAfterDiscount() = 최종 할인받은 금액
		
//		Customer c = new Customer(1, "conan", 10);
//		Invoice i = new Invoice(111, c ,30000);
//		System.out.println(i.getAmountAfterDiscount());
//		System.out.println(i.getCustomerName());
		
		//인보이스 배열에 집어넣을때에 customer가 필요..?
		
		Scanner scan = new Scanner(System.in);
		
		Invoice[] iArr= new Invoice[3];
		
		for(int i =0; i<iArr.length; i++) {//고객명, 할인율 = customer , 상품아이디, 총액 =invoice 
			System.out.println("상품아이디, 고객명, 할인율, 총액 순서대로 입력하세요 >>");
			iArr[i]= new Invoice(scan.nextInt(), //상품아이디를 입력받음
					new Customer(i+1,scan.next(),scan.nextInt()), //여기는 invoice의 필드에
					//없는 내용이라서 invoice 필드에 customer가 있기때문에 customer를 배열 안에
					//생성해 주고 그 후에 customer생성자의 형식에 맞춰서 세 칸 을 넣어준다( i+1, scan,scan)
					scan.nextDouble()); // 총액을 입력받음
			//배열에 저장하는 것........
		}
		for(int i=0; i<iArr.length; i++) {
			System.out.printf("%s님께서 %d를 구매하고 총액 %.1f원에서 %d%% 할인받아 최종 지불액은"
					+ " %.1f원임\n", 
					iArr[i].getCustomerName(),
					iArr[i].getId(),
					iArr[i].getAmount(),
					iArr[i].getCustomer().getDiscount(), //discount는 invoice에 없기때문에
					//customer를 통해서 받아와야함
					iArr[i].getAmountAfterDiscount());
		}
	}

}
