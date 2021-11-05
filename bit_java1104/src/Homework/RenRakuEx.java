package Homework;

import java.util.Scanner;

class Member{
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name,String phoneNo, String addr) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.addr = addr;
	}
	public String toString() { //�̸�, ����ȣ, �ּ� ������
		return String.format("%s %s %s", name,phoneNo,addr);
	}
	public String getName() {
		return name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public String getAddr() {
		return addr;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
}
public class RenRakuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Member[] memberArr=new Member[20]; //�迭����
		int selectCount=0; //�˻�Ƚ��(������ų����)
		int count=0; //�迭�� length�� �� ����(��� �����Ͽ� ����� ��)
		String selectName=null; //�˻��� �̸� �ʱ�ȭ
		int deleteCount=0; //�����Ϸ������� ��ġ���� �ʾƼ� �������� Ƚ��
		
		BREAK:
		while(true) {
			System.out.println("===========================================");
			System.out.println("1.��ȭ��ȣ �߰� 2.��ȭ��ȣ ��ȸ 3.��ȭ��ȣ ���� 4.��ȭ��ȣ ��� 5.���α׷� ����");
			System.out.println("===========================================");
			System.out.println("�޴��� �����ϼ���>>");
			
			int menu = scan.nextInt(); //�޴� ���ڷ� �Է¹���
			
			switch(menu) {
			case 1:
				System.out.println("�̸�, ��ȭ��ȣ, �ּ� ������ �Է��ϼ���");
				memberArr[count]= new Member(scan.next(), 
						scan.next(),scan.next()); //�̸�, ��ȭ��ȣ, �ּ� ������ �Է¹���
				count++;
				break;
			case 2:
				System.out.print("��ȸ�� ȸ���� �̸��� �Է��ϼ���>> ");
				selectName = scan.next(); //�˻��� ȸ�����̸��� selectName�� �Է¹���
				for(int i=0; i<count; i++) {
					if(selectName.equals(memberArr[i].getName())) {
						System.out.println(memberArr[i].toString());
						selectCount++; //�˻��� ȸ���� �̸��� memberArr[i]�� �̸��� ���ٸ� 
						//�� ����� ������ �����ְ�
						//selectCount++�� ����.(�˻��� ȸ���� ��ġ�� Ƚ��)
					} //��ã���� ����������..
				}
				if(selectCount==0) { //��ã���� �� = ã�� Ƚ���� 0�϶� (������ for������ �� ã�Ҵµ���
					//ã��Ƚ���� 0�ΰŴϱ�
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				break;
				
			case 3:
				System.out.println("���� ȸ���� �̸��� �Է��ϼ���>> ");
				String deleteName=scan.next(); //������ ȸ���� �̸�
				int checkCount = count; // count�� �ӽ÷� �����ص� ����(�� ������ĸ� �ؿ��� count�� --�ҰŶ�
				//������ ���� ���� �迭�� ũ�⸦ ����س����ϱ� ����
				for(int i=0; i<count; i++) { //count�� --�ϱ� ���̴ϱ� memberArr.length��ŭ ���ư��°�
					if(deleteName.equals(memberArr[i].getName())) {
						//memberArr.remove(i); //Ư�� �迭 ��Ұ� ����(?) ->�̰� ����Ʈ������ ��밡���ϴ� �Ф�
						//memberArr.splice(i,1);
						count--; //���࿡ ã���� �����ϱ⺸�ٴ� count�� �ٿ��� �˻������� ���� ����.
						for(int j=i; j<count; j++) {//������ �ƴ϶� ������ ���̱� ������
							memberArr[j]=memberArr[j+1]; //ã���� ���� ã���� index+1�� ������ ������
							//�̰� �������̳ĸ� index�� 0�̶� ġ�� 0��° �Ÿ� 1��°������ �����°�.
							//�ڿ����� �տ����� �� 1ĭ�� ������ ��ĭ �̵���Ű�°���
							//�׷� n[j]��° �ִ� �ᱹ for���� �� ���ư� �� �� �ڷ� �̵��� �ǰ���??
							//�ٵ� ������ count--�� �߱� ������ �� �� �ε���-1 ������ ������ �迭�� �̿��Ұ���
						}
						System.out.println("�ش� ����� �����Ͽ����ϴ�"); //��� �����Ȱ� �ƴ϶� count��
						//�����ҹ迭�� �ٷ� �������� �д°� ��
					}else
					deleteCount++; //�����Ϸ������� ��ġ���� �ʾƼ� �������� Ƚ��
					}
				if(deleteCount==checkCount) { //�迭 ������ ���ٰ� ������ �ϹǷ� �������� Ƚ���� �迭length��
					//���ٸ� �������� �ʴ� ȸ���Դϴ� ���
					//�� count�Ƚ�ĸ� ���� for������ --�� ������༭ count���� ���� �迭�� ���̺��� �۾��� 
					//�ֱ� ���� checkCount��� ������ ���� ������� ��
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				break;
			case 4:
				System.out.printf("��Ͽ� ����� ȸ�� ���� %d���Դϴ�\n",count); //count���� ���� case 3
				//�ּ� �ٿ������� ����� ȸ������ count�� �����
				for(int i=0; i<count; i++) { //���� ����� �迭�� ���� �����ش�
					System.out.println(memberArr[i].toString());
				}
				break;
			case 5:
				break BREAK; //�󺧷� break�ȴ�
				
		}
	}

	}
}	
