package DataStructure;

//import java.util.Arrays;
//import java.util.Collections;

public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		System.out.printf("intArray[%d]=%d\n",i,arr[i]);
		}
		System.out.println("역순으로 정렬한 후");
		
		int[] reverseArr = new int[5];
		for(int i=arr.length-1, j=0; i>=0; i--,j++) { //arr배열의 마지막 인덱스(arr.length-1)
			// -1안하면 우리가 생각한 크기보다 1커지기 땜에 꼭 -1해야한다
			reverseArr[j]=arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("intArray[%d]=%d\n",i,reverseArr[i]);
		}
	}
	
//	public static void reverse(int[] arr) {
//	      Collections.reverse(Arrays.asList(arr));
//	      System.out.println(Arrays.asList(arr));
//	    } 

}
