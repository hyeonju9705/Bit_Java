package bit_java1110;

class Ohno extends Thread{
	public Ohno(String name) {
		super(name);
	}
	
	public void run(){
		while(true) {
			int num1 =(int)(Math.random()*10)+1;
			int num2 =(int)(Math.random()*10)+1;
			int num3 =(int)(Math.random()*10)+1;
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				return;
			}
	System.out.printf("%s %d %d %d\n", Thread.currentThread().getName() ,num1, num2, num3);
	if( num1 == num2 && num2==num3) {
		System.out.printf("%s 빙고!!! =====================================\n", Thread.currentThread().getName());
		break;
	}
	}
	}
}

public class SlotEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ohno c = new Ohno("코난");
		Ohno r = new Ohno("장미");
		Ohno m = new Ohno("미란");
		
		c.setPriority(10);
		r.setPriority(9);
		m.setPriority(8);
		c.start();
		r.start();
		m.start();
	}

}
