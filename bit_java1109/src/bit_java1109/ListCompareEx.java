package bit_java1109;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime, endTime;
		DecimalFormat df = new DecimalFormat("#,###.0");
		
		startTime = System.nanoTime(); //����ð� --> ����
		for(int i=0; i<10000; i++)
			list1.add(0,String.valueOf(i));
		endTime = System.nanoTime(); //����ð� --> ��
		System.out.printf("ArrayList�� �����ϴµ� �ɸ� �ð� : %snsec\n", df.format(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
			list2.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.printf("LinkedList�� ������ �����ϴ� �� �ɸ� �ð� : %snsec", df.format(endTime-startTime));
	}

}
