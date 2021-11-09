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
		
		startTime = System.nanoTime(); //현재시간 --> 시작
		for(int i=0; i<10000; i++)
			list1.add(0,String.valueOf(i));
		endTime = System.nanoTime(); //현재시간 --> 끝
		System.out.printf("ArrayList에 저장하는데 걸린 시간 : %snsec\n", df.format(endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++)
			list2.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.printf("LinkedList에 데이터 저장하는 데 걸린 시간 : %snsec", df.format(endTime-startTime));
	}

}
