package bit_java1110;

import java.util.Random;

class Local extends Thread{
	private int open=0;
	
	public Local(String name) {
		super(name);
	}
	public void run(){
		//������ ���� ���ٰ�,,,, ���ڱ� ohoh�޼ҵ带 Ǯ� run�޼ҵ� �ȿ� �־������ �� ������?
		//������ sleep���� ��������� ����� �ð��� Ȯ���Ǵϱ�
		//sleep�� �ϱ����� print�޼ҵ尡 �����ִٸ� �ٸ� �����尡 �� ����Ϸ����ϴϱ�
		//������ �׷��Ű���..... 
		//��� : ������ ������ �߿��ϴ�(?)
		while(true) {     
		         try {
		            Random rand = new Random();
		            Thread.sleep(rand.nextInt(500)+500);
		         } catch(InterruptedException e) {
		            return;
		         }
		         Random rand = new Random();
		         int openUp = rand.nextInt(5)+1; //��ǥ ������
		         open=open+openUp;
		         int i = 0;
		         if(open>100) { //��ǥ���� 100�� ������ �׳� ����...
		            return;
		         }else {
		            System.out.printf("\n%s ��ǥ�� : %d%%(��ǥ������ : %d%%)", Thread.currentThread().getName(),open,openUp); 
		            while(i<open) {
		               i++;
		               System.out.print("*");
		            }

		         }

		      }
		   }
			
		}
//	public void ohoh() {
//		Random rand = new Random();
//		int openUp = rand.nextInt(5)+1; //��ǥ ������
//		open=open+openUp;
//		int i = 0;
//		if(open>100) { //��ǥ���� 100�� ������ �׳� ����...
//			return;
//		}else {
//			System.out.printf("\n%s ��ǥ�� : %d%%(��ǥ������ : %d%%)", Thread.currentThread().getName(),open,openUp); 
//			while(i<open) {
//				i++;
//				System.out.print("*");
//			}
//			
//		}
//	
//	}



public class ThreadEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local one = new Local("��1������");
		Local two = new Local("��2������");
		Local three = new Local("��3������");
		
//		one.setPriority(10);
//		three.setPriority(9);
//		two.setPriority(8);
		
		one.start();
		two.start();
		three.start();
	}

}

