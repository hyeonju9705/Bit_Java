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
		System.out.println("�������� ������ ��");
		
		int[] reverseArr = new int[5];
		for(int i=arr.length-1, j=0; i>=0; i--,j++) { //arr�迭�� ������ �ε���(arr.length-1)
			// -1���ϸ� �츮�� ������ ũ�⺸�� 1Ŀ���� ���� �� -1�ؾ��Ѵ�
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
