package ThreePM1029;

import java.util.Scanner;

public class Scanner4PM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //스캐너 타입의 객체를 참조하는 변수 scan
		
		//이름 (String), 주소(String), 나이(int), 키(double)을 키보드에서 입력받으려고 함
		System.out.print("당신의 이름을 입력하세요 ->");
		String name = scan.next(); //이름
		System.out.print("당신의 주소를 입력하세요 ->");
		String addr = scan.next(); //주소
		System.out.print("당신의 나이를 입력하세요 ->");
		int age =scan.nextInt(); //나이
		System.out.print("당신의 키(cm)를 입력하세요 ->");
		double height = scan.nextDouble(); //키
		System.out.println(name+" "+addr+" "+age+" "+height);
		System.out.printf("이름: %s\n 주소: %s\n 나이: %d\n 키: %f\n", 
				name,addr,age,height);
	}
}
