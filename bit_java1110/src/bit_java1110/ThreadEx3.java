package bit_java1110;

import java.util.Random;

class Local extends Thread{
	private int open=0;
	
	public Local(String name) {
		super(name);
	}
	public void run(){
		//오류가 졸라 나다가,,,, 갑자기 ohoh메소드를 풀어서 run메소드 안에 넣어줬더니 됨 뭐ㅈㅣ?
		//이유는 sleep으로 재웠을때에 출력할 시간을 확보되니까
		//sleep을 하기전에 print메소드가 먼저있다면 다른 쓰레드가 또 출력하려고하니까
		//꼬여서 그런거같다..... 
		//결론 : 슬립은 굉장히 중요하다(?)
		while(true) {     
		         try {
		            Random rand = new Random();
		            Thread.sleep(rand.nextInt(500)+500);
		         } catch(InterruptedException e) {
		            return;
		         }
		         Random rand = new Random();
		         int openUp = rand.nextInt(5)+1; //개표 증가율
		         open=open+openUp;
		         int i = 0;
		         if(open>100) { //개표율이 100을 넘으면 그냥 종료...
		            return;
		         }else {
		            System.out.printf("\n%s 개표율 : %d%%(개표증가율 : %d%%)", Thread.currentThread().getName(),open,openUp); 
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
//		int openUp = rand.nextInt(5)+1; //개표 증가율
//		open=open+openUp;
//		int i = 0;
//		if(open>100) { //개표율이 100을 넘으면 그냥 종료...
//			return;
//		}else {
//			System.out.printf("\n%s 개표율 : %d%%(개표증가율 : %d%%)", Thread.currentThread().getName(),open,openUp); 
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
		Local one = new Local("제1지역구");
		Local two = new Local("제2지역구");
		Local three = new Local("제3지역구");
		
//		one.setPriority(10);
//		three.setPriority(9);
//		two.setPriority(8);
		
		one.start();
		two.start();
		three.start();
	}

}

