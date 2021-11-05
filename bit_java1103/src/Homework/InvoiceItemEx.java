package Homework;

import java.util.Scanner;

class InvoiceItem{
	String id; // ��ǰ ���̵�
	String desc; //��ǰ��
	int qty; // ���� ����
	double unitPrice; //�ܰ�
	
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
	public double getTotal() { //�����Ѿ�
		return unitPrice*qty; //�ܰ� *����
	}
	public String toString() {
		return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.1f]",
				getId(),getDesc(),getQty(),getUnitPrice()); 
	}
}

public class InvoiceItemEx {

	public static void main(String[] args) {
		// to String = �ʵ���� ��Ʈ������ ��� �ٲ��ִ°� �ض�
		//�迭���ٰ� �־��ּ� ���̵� ��ǰ�� �̷���
		Scanner scan = new Scanner(System.in);
		
		InvoiceItem[] invoiceArr= new InvoiceItem[3]; //�迭 ����
		for(int i=0; i<invoiceArr.length; i++) {
			invoiceArr[i]= new InvoiceItem(scan.next(),  //�迭���� �Է¹޾Ƽ� ����
					scan.next(),scan.nextInt(),scan.nextDouble());
		}
		for(int i=0; i<invoiceArr.length; i++) {
			System.out.print(invoiceArr[i].toString()); //��ǰ��� �����ְ�
			System.out.printf("�� �����Ѿ��� %.1f\n", invoiceArr[i].getTotal()); //�����Ѿ� ������
		}
	}

}
