package bit_java1109;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0,"�͹̳�����");
		myList.add(2,"�ƹ�Ÿ");
		
		for(String str : myList)
			System.out.printf("%s ", str);
		System.out.println();
		
		Collections.sort(myList); //���ڿ� ����
		for(String str : myList)
			System.out.printf("%s ", str);
		System.out.println();
		
		Collections.reverse(myList); //�ݴ�� ����
		for(String str : myList)
			System.out.printf("%s ", str);
	}

}
