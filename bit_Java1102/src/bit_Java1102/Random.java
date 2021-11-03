package bit_Java1102;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int [] iArray = new int[5];
		for(int i=0; i<iArray.length; i++) {
			iArray[i]= rand.nextInt(10)+1; //쌤은 메소드 정의를 안하신거같은데머지
		}
		
		for(int i=0; i<iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
		System.out.println(iArray[0]);
		System.out.println(args.length);
		System.out.println(args[0]);
	}
	
	public int rand(int x)
}
