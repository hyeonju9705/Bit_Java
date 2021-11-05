package bit_java1104;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			int[] intArray = new int[3];
			for(int i=0; i<intArray.length+1; i++) {
				System.out.printf("intArray[%d]= ", i);
				intArray[i]= scan.nextInt();
			}
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("¹è¿­ÀÇ ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù.");
			}
		
	}

}
