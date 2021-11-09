package AM10;

import java.util.Scanner;

class MyQueue{ //복습 개어렵다 ㅡㅡㅡ
	public int front=0;
	public int rear=0;
	public int[] que;
	public int capa; //큐의 용량 : 큐에 저장할 수 있는 최대 데이터 수
	
	public MyQueue(int capa) {
		this.capa=capa;
		//int que[] = new int[capa]; //이렇게 선언하면 위에 private 의 que랑은 다른 que인 지역변수가 만들어지는거라서
		que= new int[capa];// 이렇게 전역변수인 private que를 선언해줘야 진짜 우리가 사용하려는 que에 저장됨
		//capa만큼 공간을 갖는 큐(배열)생성하기
	}
	public void enQueue(int element) {
		//큐에 요소를 저장
//		que[rear++]=element;
//		if(rear==capa)
//		rear=(rear+1)%capa;
		if((rear+1)%capa == front)
			System.out.println("큐가 가득참");
		else {
			que[(++rear)%capa] = element;
			System.out.println(element+"를 큐에 저장");
		}
	}
	public int deQueue() {
		//큐에서 저장된 요소를 꺼냄, front update
		//front 는 가장 첫번쩨ㅐ 요소
		//if(front==rear)
		front= (front+1)%capa;
			return que[front];
			
	}
	public int peek() { //큐에서 프론트에 위치한 요소를 엿보기
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
		System.out.print("큐의 크기를 입력하시오 >> ");
		int num = scan.nextInt();
		
		MyQueue mq = new MyQueue(num);
		for(int i=0; i<num; i++) {
			int rand=(int)(Math.random()*100)+1;
			mq.enQueue(rand);
			System.out.printf("%d를 큐에 저장\n",rand);
		}
		System.out.println("프론트 위치의 값 엿보기 중 : "+mq.peek());
		System.out.println("덤프 메소드 호출함");
		mq.dump();
		System.out.println("저장된 데이터를 모두 디큐함");
			
		for(int i=0; i<mq.capa; i++) {
			System.out.printf("%d를 큐에서 삭제함\n",mq.deQueue()); //다시
		}
//		System.out.println("현재 프론트의 인덱스 : "+mq.peek());
//		System.out.println("덤프 메소드 호출함");
//		mq.dump();
//		
//		for(int i=0; i<num; i++) {
//			System.out.printf("%d번째 디큐한 값 : %d",i+1,mq.deQueue());
//		}
		
	}
	}


