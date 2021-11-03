package Homework;

import java.util.Scanner;
//제일어려움 복습 필수,,,,

class Student{
	public String name; //학생이름
	public int ban; //반
	public int no; //번호
	public int kor; //국어점수
	public int eng; //영어점수 
	public int math; //수학점수
	
	
	public int getTotal() {
		return this.kor+this.eng+this.math; //총점
	}
	public double getAverage() {
		return Math.round((getTotal()/3.0)*100)/100.0; //소숫점 예쁘게 보여줄려고 한것
	}
	public void showInfo() {
		System.out.println(this.name +" "+this.ban+" "+this.no+" "+this.kor+" "
				+this.eng+" "+
				this.math+" "+
				this.getTotal()+" "+this.getAverage()); //모든것을 다 출력해주는 함수
	}
}
public class StudentEx {

	public static void main(String[] args) {
		// 세명을 저장할 수 있는 배열 만들기(student 객체저장)
		//입력 한번 출력한번,,,,(반복문)
		// showInfo()를 호출하면 쫘라락 나올 수 있도록
		//반드시 배열 이용하기
		Scanner scan = new Scanner(System.in);
		
		
		
		Student[] stdArr = new Student[3]; //배열 생성
		for(int i=0; i<3; i++) {
			stdArr[i] = new Student(); //생성자 선언
			System.out.println("학생정보를 이름, 반, 번호, 국어, 영어, 수학, 순서대로 "
					+ "입력하세요 -->>");
			stdArr[i].name = scan.next(); //일일히 입력받음. 받아서 생성자의 name에 저장
			stdArr[i].ban = scan.nextInt();
			stdArr[i].no = scan.nextInt();
			stdArr[i].kor = scan.nextInt();
			stdArr[i].eng = scan.nextInt();
			stdArr[i].math = scan.nextInt();
		}
		
		System.out.println("-----------------------------------");
		System.out.println("학생이름 반 번호 국어 영어 수학 총점 평균");
		for(int i = 0; i< stdArr.length; i++) // 위에서 만든 배열을 돌려줌으로써 모든 배열의값을
			stdArr[i].showInfo(); //출력
	}

}


