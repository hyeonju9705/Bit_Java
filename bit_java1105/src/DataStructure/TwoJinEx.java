package DataStructure;

import java.util.Scanner;

public class TwoJinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("�����͸� ������������ �Է��Ͻÿ� >>");
		int iArr[]= new int[11]; 
		
		for(int i=0; i<iArr.length; i++) {
		iArr[i]=scan.nextInt();
		System.out.printf("iArray[%d]=%d\n",i,iArr[i]); //�Է¹����� �迭�� ������� ����
		}
		
		System.out.print("�˻��� ���� �Է��ϼ��� >> ");
		int num = scan.nextInt(); //�˻��� �� ������ ���� num
		binSearch(iArr,num); // num�� �迭�� binSearchȣ��
		
		if(binSearch(iArr,num)==-1) { //-1�� ���ϵȴٸ�? ���°��̹Ƿ� ���ٰ� ���
			System.out.printf("%d�� �迭�� �������� ����",num); 
		} else { // -1�� �������� �ʾҴٸ� �����ߴٴ� ���̹Ƿ� return���� �ε������� ���ڸ� �������
			System.out.printf("%d�� �ε��� %d�� ��ġ��", num,binSearch(iArr,num));
		}
	}
	public static int binSearch(int [] iArray, int key) {
		for (int i=0; i<iArray.length; i++) {
			if(iArray[i]==key) { //for���� �ϴ� �迭�� ũ�⸸ŭ ���ư��µ� ���⼭ �Է��� ���� �迭[i]���� ��ġ�Ѵٸ�?
				return i; //�ε����� ����
			} 
		}
		return -1; //for���� �����µ� ��ã���Ÿ� return�� �����ذŴ� �ڵ����� return -1
	}
}
