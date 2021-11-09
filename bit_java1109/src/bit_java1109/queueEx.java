package bit_java1109;

import java.util.Scanner;

class MyQueue{
	private int front=-1;
	private int rear=-1;
	private int[] que;
	private int capa; //큐의 용량 : 큐에 저장할 수 있는 최대 데이터 수
	
	public MyQueue(int capa) {
		//int que[] = new int[capa]; //이렇게 선언하면 위에 private 의 que랑은 다른 que인 지역변수가 만들어지는거라서
		que= new int[capa];// 이렇게 전역변수인 private que를 선언해줘야 진짜 우리가 사용하려는 que에 저장됨
		this.capa=capa; //이렇게 카파 값을 저장 안해주면 그냥 capa는 깡통이라 밑의 함수들에도 영향을 끼쳐서
		//예를 들면 dump()가 출력이 안되게됨
		//capa만큼 공간을 갖는 큐(배열)생성하기
	}
	public void enQueue(int element) {
		if(front==-1)
			front++;
		que[++rear]=element;
	}
	public int deQueue() {
		//큐에서 저장된 요소를 꺼냄, front update
		//front 는 가장 첫번쩨ㅐ 요소
		if(front==rear) {
			return que[front];
		}else
			return que[front++];
	}
	public int peek() { //큐에서 프론트에 위치한 요소를 엿보기
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
		
		System.out.print("큐의 크기를 입력하시오 >>");
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
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d번째 디큐한 값 : %d\n",i+1,mq.deQueue());
		}
		
	}

}
