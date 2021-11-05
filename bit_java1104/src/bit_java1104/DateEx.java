package bit_java1104;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy�� MM�� dd hh�� mm�� ss��");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
		//��, ����, �ð�, ��
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		
		int yoil=today.get(Calendar.DAY_OF_WEEK);
		
		switch(yoil) {
		case 1:
			System.out.println("�Ͽ���");
			break;
		case 2:
			System.out.println("������");
			break;
		case 3:
			System.out.println("ȭ����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("�����");
			break;
		case 6:
			System.out.println("�ݿ���");
			break;
		case 7:
			System.out.println("�����");
			break;
			
		}
		
		today.clear();
		today.set(2019,11,25);
		today.set(Calendar.HOUR_OF_DAY, 20);
		today.set(Calendar.MINUTE, 30);
		System.out.println(today.getTime());
	}

}
