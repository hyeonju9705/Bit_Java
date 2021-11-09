package AM10;

import java.util.Scanner;

class MyQueue{ //���� ����ƴ� �ѤѤ�
	public int front=0;
	public int rear=0;
	public int[] que;
	public int capa; //ť�� �뷮 : ť�� ������ �� �ִ� �ִ� ������ ��
	
	public MyQueue(int capa) {
		this.capa=capa;
		//int que[] = new int[capa]; //�̷��� �����ϸ� ���� private �� que���� �ٸ� que�� ���������� ��������°Ŷ�
		que= new int[capa];// �̷��� ���������� private que�� ��������� ��¥ �츮�� ����Ϸ��� que�� �����
		//capa��ŭ ������ ���� ť(�迭)�����ϱ�
	}
	public void enQueue(int element) {
		//ť�� ��Ҹ� ����
//		que[rear++]=element;
//		if(rear==capa)
//		rear=(rear+1)%capa;
		if((rear+1)%capa == front)
			System.out.println("ť�� ������");
		else {
			que[(++rear)%capa] = element;
			System.out.println(element+"�� ť�� ����");
		}
	}
	public int deQueue() {
		//ť���� ����� ��Ҹ� ����, front update
		//front �� ���� ù���Ť� ���
		//if(front==rear)
		front= (front+1)%capa;
			return que[front];
			
	}
	public int peek() { //ť���� ����Ʈ�� ��ġ�� ��Ҹ� ������
		return que[front];
	}
	public void clear() {
		front=0;
		rear=0;
	}
	public int capacity() {
		return capa;
	}
	public boolean isEmpty() {
		if(front==rear) {
			return true;
		}else
			return false;
	}
	public boolean isFull() {
		if((rear+1)%capa==front) {
			return true;
		}else
			return false;
	}
	public void dump() {
		for(int i=0; i<capa; i++) {
//			if(i==rear)
//				return;
		System.out.printf("que[%d] = %d\n", i,que[i]);
		}
	}
}

public class OneQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		System.out.print("ť�� ũ�⸦ �Է��Ͻÿ� >> ");
		int num = scan.nextInt();
		
		MyQueue mq = new MyQueue(num);
		for(int i=0; i<num; i++) {
			int rand=(int)(Math.random()*100)+1;
			mq.enQueue(rand);
			System.out.printf("%d�� ť�� ����\n",rand);
		}
		System.out.println("����Ʈ ��ġ�� �� ������ �� : "+mq.peek());
		System.out.println("���� �޼ҵ� ȣ����");
		mq.dump();
		System.out.println("����� �����͸� ��� ��ť��");
			
		for(int i=0; i<mq.capa; i++) {
			System.out.printf("%d�� ť���� ������\n",mq.deQueue()); //�ٽ�
		}
//		System.out.println("���� ����Ʈ�� �ε��� : "+mq.peek());
//		System.out.println("���� �޼ҵ� ȣ����");
//		mq.dump();
//		
//		for(int i=0; i<num; i++) {
//			System.out.printf("%d��° ��ť�� �� : %d",i+1,mq.deQueue());
//		}
		
	}
	}


