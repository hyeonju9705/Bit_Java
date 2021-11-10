package bit_java1110;

class PriorityThread extends Thread{
	public PriorityThread (String name) {
		super(name); //쓰레드 생성시 이름을 지정하기위해 매개변수 생성자 정의
	}
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.print(i+"번째");
			System.out.print("실행중인 쓰레드 이름 : "+Thread.currentThread().getName());
			System.out.println("---> 쓰레드 우선 순위 : "+Thread.currentThread().getPriority());
		}
	}
}
public class PriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread p1 = new PriorityThread("높음");
		PriorityThread p2 = new PriorityThread("중간임");
		PriorityThread p3 = new PriorityThread("낮음");
		p1.setPriority(Thread.MAX_PRIORITY); //우선순위의 숫자가 높을수록 우선순위가 높은 것
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		p1.start(); //p1이 다 끝난다음 p2실행되는건 아니지만 대체로 그런 경향(?)
		p2.start(); //우선순위 숫자가 별로 차이가 안나면 거의 다 동시에 실행되는경향..
		p3.start();
	}

}
