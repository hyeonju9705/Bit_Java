package bit_java1101;

import java.util.Scanner;

public class Kaisya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("근무시간을 입력하시오 -->");
		int time = scan.nextInt();  //5
		int dae = 0;
		
		if(24%time == 0) {
			dae = 24/time;
		} else {
			dae= 24/time+1;
		}
	
//		if(time >24) {
//			dae = 1;
//		} else {
//			dae = 24/time;  //대는 4
//			if((24%time)>0) { //건너뜀
//				dae =dae+1;
//			} 
//		} 완전 잘못한 ㅠㅠ
		
		//총량이 24 
		//입력된 시간으로 나누어 떨어지면, 24/시간
		//나누어 떨어지지 않으면, 24/시간 +1
		//(24%입력된 시간 ==0)? 24/시간 : 24/시간 +1  //선생님 답
		System.out.print("필요한 컴퓨터 수량은 "+dae);
		
	}

}
