package bit_java1109;

import java.util.Scanner;

class MyQueue{
	private int front=-1;
	private int rear=-1;
	private int[] que;
	private int capa; //ť�� �뷮 : ť�� ������ �� �ִ� �ִ� ������ ��
	
	public MyQueue(int capa) {
		//int que[] = new int[capa]; //�̷��� �����ϸ� ���� private �� que���� �ٸ� que�� ���������� ��������°Ŷ�
		que= new int[capa];// �̷��� ���������� private que�� ��������� ��¥ �츮�� ����Ϸ��� que�� �����
		this.capa=capa; //�̷��� ī�� ���� ���� �����ָ� �׳� capa�� �����̶� ���� �Լ��鿡�� ������ ���ļ�
		//���� ��� dump()�� ����� �ȵǰԵ�
		//capa��ŭ ������ ���� ť(�迭)�����ϱ�
	}
	public void enQueue(int element) {
		if(front==-1)
			front++;
		que[++rear]=element;
	}
	public int deQueue() {
		//ť���� ����� ��Ҹ� ����, front update
		//front �� ���� ù���Ť� ���
		if(front==rear) {
			return que[front];
		}else
			return que[front++];
	}
	public int peek() { //ť���� ����Ʈ�� ��ġ�� ��Ҹ� ������
		return que[front];
	}
	public void clear() {
		front=-1;
		rear=-1;
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
		if(rear==capa-1) {
			return true;
		}else
			return false;
	}
	public void dump() {
		for(int i=0; i<capa; i++) {
		System.out.printf("que[%d] = %d\n", i,que[i]);
		}
	}
}
public class queueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ť�� ũ�⸦ �Է��Ͻÿ� >>");
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
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d��° ��ť�� �� : %d\n",i+1,mq.deQueue());
		}
		
	}

}
