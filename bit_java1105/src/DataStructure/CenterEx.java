package DataStructure;

import java.util.Scanner;

public class CenterEx {

	public static void main(String[] args) {
		// 세 수의 중앙값 구하기
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력받고, 그 중 중앙값을 구하기");
		System.out.print("a : ");
		int a= scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");//왜케복잡해 ㅡㅡㅡㅡㅡㅡ 복습필수
		int c = scan.nextInt();

		med3(a,b,c);


		//		if(a>=b) {
		//			if(a>b) {
		//				if(b>=c) {
		//					if(b>c) {
		//						if(c>b)
		//						center=b;
		//						else
		//							center=c;
		//					}else if(a>=c) {
		//						if(a>c) {
		//							center=c;
		//						}
		//					}
		//				}
		//				else if(b>=c) {
		//					if(b>c) {
		//						center=b;
		//					}
		//				}
		//			}
		//			else if(a>=c) {
		//				if(a>c) {
		//					center=a;
		//				} else if(b>=c) {
		//					if(b>c) {
		//						center=c;
		//					} else {
		//						center=b;
		//					}
		//				}
		//			}
		//			
		//		}


		System.out.printf("중앙값은 : %d임",med3(a,b,c));

	}
	public static int med3(int a, int b, int c) { 
		if (a >= b) if (b >= c) 
			return b; 
		else if (a <= c) 
			return a; 
		else 
			return c; 
		else if (a > c) 
			return a; 
		else if (b > c) 
			return c; 
		else return b; 
	}

}
