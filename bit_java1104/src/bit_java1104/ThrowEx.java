package bit_java1104;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		try {
			square(scan.next());
//		} catch(Exception e){
//			System.out.println(e.getMessage()); 
//			}
		}
	private static void square(String str) {
		try {
		int n = Integer.parseInt(str);
		System.out.println(n*n);
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
