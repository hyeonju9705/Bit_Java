package ThreePM1029;

import java.util.Scanner;

public class ConanExam {

	public static void main(String[] args) {
		// 코난이 97개의 빵을 3개씩
		int x= 97/3;
		int y = 97%3;
		System.out.println("빵을 나누어 줄 수 있는 학생의 수 :"+x);
		
		System.out.print("남는 빵 개수: "+y);
	}

}
