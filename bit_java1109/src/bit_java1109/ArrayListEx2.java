package bit_java1109;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		String name=null;
		for(int i=0; i<4; i++) {
		System.out.print("�̸��� �Է��ϼ��� >>");
		name=scan.next();
		al.add(name);
		}
		
		Object[] a = al.toArray();
		for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+ " ");
		}
		//get(int index) ����� �ε����� ��� ��ȯ
		int longestIndex =0;
		for(int i=0; i<a.length; i++) {
			if(al.get(longestIndex).length()<al.get(i).length()) //index ���ϱ� �ε��� 0�� ����� ���� length���� int 0�� ����� ���� length�� ũ�ٸ�
				longestIndex=i; //i�� �� ū�Ŵϱ� i�� longestIndex�� �ǰ�
		}
		
		System.out.print("���� �� �̸��� : "+al.get(longestIndex)); //�ε��� ��ȣ�� ��ȯ�Ǳ� ���� get(�ε�����ȣ)�� �����ͼ� ������
	}

}
