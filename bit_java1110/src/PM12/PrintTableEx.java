package PM12;

class PrintTable{
	//구구단 출력하는 동기화가 필요한 메소드,synchronized
	synchronized public void printTable(int n) { //와 개신기해 앞에 synchronized 한개만 붙여줬다고
		//순서대로 출력되다니??????
		System.out.println(n+"단 출력");
		for(int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
			try { Thread.sleep(500);}
			catch(InterruptedException e) {}
		}
	}
}

class PrintThread extends Thread{ //구구단 출력을 실행할 쓰레드
	PrintTable pt; //공유하는 객체
	int n;
	PrintThread(PrintTable pt, int n){
		this.pt = pt;
		this.n = n;
	}
	public void run() {
		pt.printTable(n);
//		synchronized(pt) { 이렇게 synchronized 키워드를 붙여도됨!
		//메소드 전체에만 걸어도되고 , 부분적으로 블럭을 지정해서 변수를 ()에 넣어서 해도됨~
		//반드시 독점해야될 부분만 잡아서 동기화를 걸어주고(synchronized) 다른부분은 또 돌릴수 잇도록
		//해주는 지금 밑과 같은 방식이 좋음!
//			pt.printTable(n);
//		}
	}
}
public class PrintTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable pt = new PrintTable();
		PrintThread th1 = new PrintThread(pt,2);
		PrintThread th2 = new PrintThread(pt,5);
		th1.start();
		th2.start();
	}

}
