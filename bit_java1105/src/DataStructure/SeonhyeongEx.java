package DataStructure;

import java.util.Scanner;

public class SeonhyeongEx { //���� ���� ����� �ʹ� �����ϴ� �̰� ��¥ �� �ܿ�� �̤�

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int iArr[] = new int[5];
		for(int i=0; i<iArr.length; i++) {
			iArr[i]=(int)(Math.random()*100)+1;
			System.out.println(iArr[i]);
		}
		System.out.print("�˻��� ���� �Է��ϼ��� >> ");
		int num = scan.nextInt();
		seqSearch(iArr,num);
		if(seqSearch(iArr,num)==-1) {
			System.out.printf("%d�� �迭�� �������� ����",num); 
		} else {
			System.out.printf("%d�� �ε��� %d�� ��ġ��", num,seqSearch(iArr,num));
		}
		
		
	}
	public static int seqSearch(int[] iArray, int key) { //return �� ������ �߿���
		//int count=0;
//		for (int i=0; i<iArray.length; i++) {
//			if(iArray[i]==key) {
//				System.out.printf("%d�� �ε��� %d�� ��ġ��", key,i);
//				count++;
//			} 
//		}
//		if(count==0) {
//			System.out.printf("%d�� �迭�� �������� ����",key);
//		}
		for (int i=0; i<iArray.length; i++) {
			if(iArray[i]==key) {
				//System.out.printf("%d�� �ε��� %d�� ��ġ��", key,i);
				//count++; ī��Ʈ �� �ʿ� ����...! ã�ڸ��� �ٷ� return ���ָ��...
				return i;
			} 
		}
//		if(count==0) {
//			System.out.printf("%d�� �迭�� �������� ����",key);
//			return -1;
//		}
		return -1;
	}
}
