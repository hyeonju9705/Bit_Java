package Homework;

import java.util.Scanner;

class InvoiceItem{
	String id; // 상품 아이디
	String desc; //상품명
	int qty; // 구매 수량
	double unitPrice; //단가
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id=id;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	public String getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	public double getTotal() { //구매총액
		return unitPrice*qty; //단가 *수량
	}
	public String toString() {
		return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.1f]",
				getId(),getDesc(),getQty(),getUnitPrice()); 
	}
}

public class InvoiceItemEx {

	public static void main(String[] args) {
		// to String = 필드들을 스트링으로 모두 바꿔주는거 해라
		//배열에다가 넣어주셈 아이디 상품명 이런거
		Scanner scan = new Scanner(System.in);
		
		InvoiceItem[] invoiceArr= new InvoiceItem[3]; //배열 생성
		for(int i=0; i<invoiceArr.length; i++) {
			invoiceArr[i]= new InvoiceItem(scan.next(),  //배열마다 입력받아서 저장
					scan.next(),scan.nextInt(),scan.nextDouble());
		}
		for(int i=0; i<invoiceArr.length; i++) {
			System.out.print(invoiceArr[i].toString()); //상품목록 보여주고
			System.out.printf("의 구매총액은 %.1f\n", invoiceArr[i].getTotal()); //구매총액 보여줌
		}
	}

}
