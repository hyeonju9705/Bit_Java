package bit_java1101;

import java.util.Scanner;

public class Kaisya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("�ٹ��ð��� �Է��Ͻÿ� -->");
		int time = scan.nextInt();  //5
		int dae = 0;
		
		if(24%time == 0) {
			dae = 24/time;
		} else {
			dae= 24/time+1;
		}
	
//		if(time >24) {
//			dae = 1;
//		} else {
//			dae = 24/time;  //��� 4
//			if((24%time)>0) { //�ǳʶ�
//				dae =dae+1;
//			} 
//		} ���� �߸��� �Ф�
		
		//�ѷ��� 24 
		//�Էµ� �ð����� ������ ��������, 24/�ð�
		//������ �������� ������, 24/�ð� +1
		//(24%�Էµ� �ð� ==0)? 24/�ð� : 24/�ð� +1  //������ ��
		System.out.print("�ʿ��� ��ǻ�� ������ "+dae);
		
	}

}
