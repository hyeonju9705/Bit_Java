package bit_java1104;

import java.util.Arrays;

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = new int[10];
		for(int i=0; i<iArray.length; i++) {
			iArray[i]=(int)(Math.random()*100)+1;
			System.out.println(iArray[i]);
		}
		for(int i=0; i<iArray.length; i++) {
			Arrays.sort(iArray);
		}
		System.out.println("오름차순--------------------");
		for(int i=0; i<iArray.length; i++) {
			System.out.println(iArray[i]);
		}
		
	}

}
